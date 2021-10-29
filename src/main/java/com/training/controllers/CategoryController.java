package com.training.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edueye.service.review.dto.response.ProductDetailsSearchResponse;
import com.edueye.service.review.dto.response.ResponseData;

import com.training.constant.ServiceConstant;
import com.training.dto.CategoryDTO;
import com.training.payload.response.CategorySearchResponse;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CategoryController {
	
//	@Autowired
//	CategoryService  categoryService;
	
	
	
	
	
//	@PostMapping(value = "/bookmark", produces = MediaType.APPLICATION_JSON_VALUE)
//	//@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//	public ResponseEntity<ResponseData> bookmark(@Valid @RequestBody BookmarkRequest bookmarkRequest) {
//		final ResponseData response = ResponseData.builder()
//				.status(ServiceConstant.STATUS_MSG_FAILED.getValue())
//				.statusCode("E001")
//				.build();
//		try {
//			User user = baseUtil.getDecryptedUserId(bookmarkRequest.getEncryptedUserId());
//			log.info("saveReviews :: bookmarkRequest.getEncryptedUserId() :: " + bookmarkRequest.getEncryptedUserId());
//			if(user == null) {
//				log.info("saveReviews :: bookmarkRequest.getEncryptedUserId() :: " + user);
//				response.setStatusCode("E002");
//				response.setMessage("User doesn't exist");
//				return ResponseEntity.ok().body(response);
//			}
//			Products products = baseUtil.getDecryptedProductId(bookmarkRequest.getEncryptedProductId());
//			if(products == null) {
//				log.info("saveReviews :: bookmarkRequest.getEncryptedUserId() :: " + user);
//				response.setStatusCode("E003");
//				response.setMessage("Product doesn't exist");
//				return ResponseEntity.ok().body(response);
//			}
//			Bookmark bookmark = bookmarkService.getBookMarkProductIdByUserId(products.getProductId(), user.getId());
//			if(bookmark==null) {
//				bookmark = new Bookmark();
//				bookmark.setUserId(user.getId());
//				bookmark.setProductId(products.getProductId());
//				bookmark.setBookedMarkedStatus(1);
//				bookmark.setLat(bookmarkRequest.getLatitude()!=null?bookmarkRequest.getLatitude():"");
//				bookmark.setLon(bookmarkRequest.getLongitute()!=null?bookmarkRequest.getLongitute():"");
//				bookmark.setActive("Y");
//				bookmark.setDeleted("N");
//				bookmark.setCreatedAt(new Date());
//				response.setMessage("Bookmark added");
//				response.setStatusCode("E010");
//			}else {
//				if(!ValidatorUtil.isValid(bookmark.getLat())) {
//					bookmark.setLat(bookmarkRequest.getLatitude()!=null?bookmarkRequest.getLatitude():"");
//				}
//				if(!ValidatorUtil.isValid(bookmark.getLon())) {
//					bookmark.setLon(bookmarkRequest.getLongitute()!=null?bookmarkRequest.getLongitute():"");
//				}
//				if(bookmark.getBookedMarkedStatus()!=null && bookmark.getBookedMarkedStatus()==1) {
//					response.setMessage("Bookmark removed");
//					bookmark.setBookedMarkedStatus(0);
//					response.setStatusCode("E011");
//				}else {
//					bookmark.setBookedMarkedStatus(1);
//					response.setMessage("Bookmark added");
//					response.setStatusCode("E010");
//				}
//			}
//			bookmark.setUpdatedAt(new Date());
//			bookmarkService.save(bookmark);
//			response.setStatus(ServiceConstant.STATUS_MSG_SUCCESS.getValue());
//			
//		}catch(Exception e) {
//			log.info("Exception caught while bookmark() :: ",e);
//			response.setMessage(ServiceConstant.SORRY_FOR_INCONVIENCE.getValue());
//		}
//		return ResponseEntity.ok().body(response);
//	}
	
	@GetMapping(value = "/category-listing", produces = MediaType.APPLICATION_JSON_VALUE)
	//@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<CategoryDTO> getCategoryDetails() {
		final CategorySearchResponse response = CategorySearchResponse.builder()
				.status(ServiceConstant.STATUS_MSG_FAILED.getValue())
				.statusCode(ServiceConstant.STATUS_CODE_FAILED.getValue())
				.build();
		try {
			
			//log.info("saveReviews :: request.getEncryptedUserId() :: " + request.getEncryptedUserId());
//			if(user == null) {
//				//log.info("saveReviews :: bookmarkListingRequest.getEncryptedUserId() :: " + user);
//				response.setStatusCode("E001");
//				response.setMessage("User doesn't exist");
//				return ResponseEntity.ok().body(response);
//			}
			
			List<CategoryDTO> bookmarks =productsUtil.getBookmarkProductDetailsByUserId(user.getId(), request.getPageNmber(), request.getSize());
			if(bookmarks!=null && !bookmarks.isEmpty()) {
				List<ProductDetailDTO> products = new ArrayList<ProductDetailDTO>();
				for(CategoryDTO bookmark : bookmarks) {
					ProductDetailDTO productDetail = googleUtil.getPlaceDetailsByPlaceId(bookmark.getPlaceId(), user, false, false, 
							request.isSkipGoogleApi(), request.isOnlyPlaceIcon(), request.isReqiredImage());
					products.add(productDetail);
				}
				response.setProducts(products);
				response.setStatus(ServiceConstant.STATUS_MSG_SUCCESS.getValue());
				response.setMessage("Bookmark products");
				response.setStatusCode("E000");
			}else {
				response.setStatusCode("E003");
				response.setMessage("No record found");
				return ResponseEntity.ok().body(response);
			}
		}catch(Exception e) {
			log.info("Exception caugth while getUserBookmarkDetails :: ",e);
			response.setMessage(ServiceConstant.SORRY_FOR_INCONVIENCE.getValue());
		}
		return ResponseEntity.ok().body(response);
	}
}