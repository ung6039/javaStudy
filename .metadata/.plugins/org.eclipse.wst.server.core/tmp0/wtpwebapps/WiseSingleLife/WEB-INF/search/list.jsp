<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <title>슬기로운 자취생활 가격비교</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/aos.css">
    <link rel="stylesheet" href="css/ionicons.min.css">
    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
    <!-- SEARCH CSS -->
    <link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="css/main.css">
  </head>
  <body>
    <!-- ================================ NAVBAR ================================ -->
    <tiles:insertAttribute name="nav"/>
    <!-- END nav -->

    <!-- ================================== FILTERS AND SAVE BTN================================== -->	
	<section class="ftco-search bg-light">
		<div class="container">
			<div class="row">
				<div class="col-md-12 search-wrap">
					<h2 class="heading h5 d-flex align-items-center pr-4"><span class="ion-ios-search mr-3"></span>상세검색</h2>
					<form action="#" class="search-property">
						<div class="row">
							<!-- <div class="col-md-2 align-items-end pl-0">
								<div class="form-group">
									<label for="#">마트</label>
									<div class="form-field">
										<div class="select-wrap">
											<div class="icon"><span class="ion-ios-arrow-down"></span></div>
											<select name="" id="" class="form-control">
												<option value="">전체</option>
												<option value="emart">이마트</option>
												<option value="homeplus">홈플러스</option>
												<option value="lotte">롯데마트</option>
												<option value="coupang">쿠팡</option>
											</select>
										</div>
									</div>
								</div>
							</div> -->
							<div class="col-md-2 pl-0">
								<div class="form-group">
									<!--  <label for="#">정렬</label>-->
									<div class="form-field">
										<div class="select-wrap">
											<div class="icon"><span class="ion-ios-arrow-down"></span></div>
											<select name="" id="" class="form-control">
                                                <option value="pop">인기랭킹순</option>
												<option value="asc">가격낮은순</option>
												<option value="desc">가격높은순</option>
											</select>
										</div>
									</div>
 								</div> 	
							</div>
						
								<!-- <div class="slider_search_area">-->
									<input class="img_slider_search" name="keyword" type="search" placeholder="검색어를 입력하세요.">
									<button class="sliderBtn">검색</button>
								<!--</div>-->
						    <!-- BUTTON -->
							<div class="col-md-2 align-self-end">
								<div class="form-group">
									<div class="form-field">
										<input type="submit" value="저장" class="form-control btn btn-primary">
									</div>
								</div>
							</div>
							
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
    
    <!-- ================================== CONTENTS================================== -->	    
    <section class="list-section mb-3 bg-light">
    	<div class="container">
			<!-- 결과 -->
			<div class="row">
				<table class="result">
					<tr class="mall_list">
						<td class="default">쇼핑몰 이름</td>
						<td class="td1">이마트</td>
						<td class="td2">롯데마트</td>
						<td class="td3">홈플러스</td>
						<td class="td4">쿠팡</td>
					</tr>
					<!-- ============================== ITEM1 ============================== -->
					<tr class="mall_result" id="product1">
						<td rowspan="2" class="product_name">바나나 우유</td>
						<!-- =============== 1.이마트 =============== -->
						<td class="emart">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shop-phinf.pstatic.net/20200210_1/1581298075142K9f83_JPEG/18658813766617391_17493234.jpg?type=m510">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">매일유업 매일 바나나는 원래 하얗다 190ml</p>
										<p class="price">10,910원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shopping-phinf.pstatic.net/main_2285035/22850351426.20200513172849.jpg?type=f300">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">매일 소화가 잘되는우유 바나나 190ml*6입</p>
										<p class="price">5,380 원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shopping-phinf.pstatic.net/main_5761002/5761002283.20150128173135.jpg?type=f300">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">[빙그레] 바나나맛 우유(240ml4개) 960ml</p>
										<p class="price">4,580 원</p>
									</a>
								</div>
							</div>
							<!-- 더보기 버튼: 컨텐츠가 3개 초과일 경우 -->
							<!-- <button type="button" class="btn btn-block" id="">+ 더 보기</button> -->
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
							
							
						</td>
						<!-- =============== 2.롯데마트 =============== -->
						<td class="lotte">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://contents.lotteon.com/itemimage/LM/88/01/10/42/20/45/3_/00/1/LM8801104220453_001_1.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">빙그레 바나나우유(240ML*4입)</p>
										<p class="price">4,590원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://contents.lotteon.com/itemimage/LM/88/01/12/17/59/96/7_/00/1/LM8801121759967_001_1.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">매일 상하목장 유기농 멸균 우유 (바나나)(125ML*3입)</p>
										<p class="price">2,380원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://contents.lotteon.com/itemimage/LM/88/01/11/51/40/78/8_/00/1/LM8801115140788_001_1.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">서울 바나나우유(260ML*2입)</p>
										<p class="price">1,680원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
						<!-- =============== 3.홈플러스 =============== -->
						<td class="homeplus">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shop-phinf.pstatic.net/20200210_1/1581298075142K9f83_JPEG/18658813766617391_17493234.jpg?type=m510">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">매일유업 매일 바나나는 원래 하얗다 190ml</p>
										<p class="price">10,910원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Pressimages/31/320/000018031_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">빙그레_바나나맛우유_240ML*4</p>
										<p class="price"> 4,600원 </p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Pressimages/11/320/100788211_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">푸르밀_생과즙바나나우유_225ML*6</p>
										<p class="price">  3,280원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
						<!-- =============== 4.쿠팡=============== -->
						<td class="coupang">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Goods/320/145628287_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">서울_바나나우유_200ML*3</p>
										<p class="price"> 2,390원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail7.coupangcdn.com/thumbnails/remote/492x492ex/image/retail/images/2018/12/17/18/9/b7642b5b-7121-48a2-945a-9df0ca92c177.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">대상웰라이프 뉴케어 마이밀 바나나</p>
										<p class="price"> 43,110원 </p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail6.coupangcdn.com/thumbnails/remote/230x230ex/image/retail/images/5434551847385-1315dc61-4986-4210-96a9-38fa5eda0a6b.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">곰곰 멸균 바나나 우유</p>
										<p class="price">  3,280원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
					</tr>
					<!-- ============================== ITEM1 GRAPH ============================== -->
					<tr class="mall_result" id="graph1">
						<!-- <td class="graph_left"></td> -->
						<td colspan="4" class="graph_area"><img src="images/graph.png" style="width: 85%;"></td>
					</tr>
					<!-- ============================== ITEM2 ============================== -->
					<tr class="mall_result" id="product1">
						<td rowspan="2" class="product_name">삼양 까르보 불닭볶음면</td>
						<td class="emart">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shopping-phinf.pstatic.net/main_1304626/13046260762.20171221101956.jpg?type=f300">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 까르보 불닭볶음면 130g</p>
										<p class="price">950원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Pressimages/32/176/128465032_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양식품_까르보불닭볶음면소컵_80G*6입</p>
										<p class="price">5,880원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail6.coupangcdn.com/thumbnails/remote/230x230ex/image/vendor_inventory/images/2018/07/05/13/7/96a76bb6-bfc4-4c3c-9516-94a87463958c.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양식품 까르보 불닭볶음면 큰컵(105g)</p>
										<p class="price">9,500원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
						<td class="lotte">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://shop-phinf.pstatic.net/20180912_218/syfood_153671034462456YVN_JPEG/19429203347270209_1392560495.jpg?type=m510">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 까르보불닭볶음면 큰컵 105gx16입</p>
										<p class="price">16,800원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail10.coupangcdn.com/thumbnails/remote/230x230ex/image/product/image/vendoritem/2018/10/22/3466796747/8bfdb981-49f0-4c9e-b1e6-9e71f8d2df2f.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 까르보 불닭볶음면 130g</p>
										<p class="price">28,060원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Goods/176/130826421_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양_까르보불닭소스_200G</p>
										<p class="price">4,200원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
						<td class="homeplus">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail8.coupangcdn.com/thumbnails/remote/230x230ex/image/retail/images/2019/08/26/10/3/6128b4cb-c207-40ea-b9f6-b659e7092298.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 컵 까르보 불닭볶음면 80g</p>
										<p class="price">4,830원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Pressimages/77/176/127927277_0.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양식품_까르보불닭볶음면_130G*4입</p>
										<p class="price"> 4,980원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/Goods/GMO/main/176/11/44/02/984114402.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 불닭볶음면 140gX12입+까르로불닭볶음면 130gX4입</p>
										<p class="price"> 15,570원</p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
						<td class="coupang">
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail10.coupangcdn.com/thumbnails/remote/230x230ex/image/product/image/vendoritem/2018/10/22/3466796747/8bfdb981-49f0-4c9e-b1e6-9e71f8d2df2f.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 까르보 불닭볶음면 130g</p>
										<p class="price">28,060원</p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail7.coupangcdn.com/thumbnails/remote/230x230ex/image/product/image/vendoritem/2019/02/14/3474800655/b4cb2eb6-b8cc-4080-a61c-d1db421bfdb9.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 큰컵 까르보 불닭볶음면 105g</p>
										<p class="price">15,680원 </p>
									</a>
								</div>
							</div>
							<div class="list_item">
								<div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail7.coupangcdn.com/thumbnails/remote/230x230ex/image/vendor_inventory/images/2019/03/27/13/9/613cd140-7c61-45ad-bdfc-98d59dd20e1c.jpg">
									</a>
								</div>
								<div class="info">
									<a href="#">
										<p class="product">삼양 까르보 불닭볶음면 소컵 80g x 24개</p>
										<p class="price">22,500원 </p>
									</a>
								</div>
							</div>
							<button type="button" class="btn btn-block moreBtn" data-toggle="modal" data-target="#moreBtn">+ 더 보기</button>
						</td>
					</tr>
					<!-- ============================== ITEM2 GRAPH ============================== -->
					<tr class="mall_result" id="graph1">
						<!-- <td class="graph_left"></td> -->
						<td colspan="4" class="graph_area"><img src="images/graph.png" style="width: 85%;"></td>
					</tr>
				</table>
			</div>
			<!-- 저장한 상품 -->
			<div class="row">
				<div class="saved">
					<div class="title">
						<h5 class="saved_title">저장한 상품</h5>
					</div>
					<div class="savedItemArea">
						<!-- <button type="button" id="recom_btn_prev" class="btn_prev" style="display: block;">
							<span class="blind">이전</span>
						</button> -->
						<!-- SAVED ITEM 1 -->
						<div class="item">
							<a href="#">
								<p class="product">매일 소화가 잘되는 우유 바나나 190ml</p>
								<p class="price mb-0">19,900원</p>
							</a>
						</div>
						<!-- SAVED ITEM 2 -->
						<div class="item">
							<a href="#">
								<p class="product">바나나맛 우유(240ml4개) 960ml</p>
								<p class="price mb-0">4,580 원</p>
							</a>
						</div>
						<!-- SAVED ITEM 3 -->
						<div class="item">
							<a href="#">
								<p class="product">삼양 큰컵 까르보 불닭볶음면 105g</p>
								<p class="price mb-0">15,680원</p>
							</a>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="saved">
					<div class="title">
						<h5 class="saved_title">추천 레시피</h5>
					</div>
					<div class="savedItemArea">
						<!-- <button type="button" id="recom_btn_prev" class="btn_prev" style="display: block;">
							<span class="blind">이전</span>
						</button> -->
						<!-- SAVED ITEM 1 -->
						<div class="item">
							<div class="img">
								<a href="#">
									<img class="product_img" src="https://recipe1.ezmember.co.kr/cache/recipe/2015/09/21/8120c5f993593892442603f5e246eb671.jpg">
								</a>
							</div>
							<a href="#">
								<p class="product">까르보나라 떡볶이</p>
								<p class="price mb-0">떡볶이,까르보나라</p>
							</a>
						</div>
						<!-- SAVED ITEM 2 -->
						<div class="item">
							<div class="img">
								<a href="#">
									<img class="product_img" src="https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F2038593F502C347533">
								</a>
							</div>
							<a href="#">
								<p class="product">든든한 영양 음료!! 바나나 미숫가루</p>
								<p class="price mb-0">바나나,</p>
							</a>
						</div>
						<!-- SAVED ITEM 3 -->
						<div class="item">
							<div class="img">
								<a href="#">
									<img class="product_img" src="https://recipe1.ezmember.co.kr/cache/recipe/2018/01/31/755216f43214f5ef82bfdcb05d934d311.png">
								</a>
							</div>
							<a href="#">
								<p class="product">불닭 까르보나라의 떡볶이 Ver. 매까떡!</p>
								<p class="price mb-0">까르보나라 불닭볶음면</p>
							</a>
						</div>
					</div>
				</div>
			</div>

			<!-- ============================== 더보기 MODAL ============================== -->
			<div class="modal fade" id="moreBtn" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog modal-lg" role="document">
				  <div class="modal-content">
					<div class="modal-header">
					  <h5 class="mb-0">[이마트] 바나나우유 전체보기</h5>
					  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					  </button>
					</div>
					<div class="modal-body">
						<section class="ftco-section py-2">
							<div class="container">
							<div class="row d-flex">
							  <!-- ========== Start of Modal Item ========== -->
							  <!-- MODAL ITEM 1 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://shop-phinf.pstatic.net/20200210_1/1581298075142K9f83_JPEG/18658813766617391_17493234.jpg?type=m510">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">매일유업 매일 소화가 잘되는 우유 바나나 190ml</p>
										<p class="price">19,900원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 2 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail6.coupangcdn.com/thumbnails/remote/230x230ex/image/retail/images/5434551847385-1315dc61-4986-4210-96a9-38fa5eda0a6b.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">곰곰 멸균 바나나 우유</p>
										<p class="price">3,280원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 3 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail7.coupangcdn.com/thumbnails/remote/492x492ex/image/retail/images/2018/12/17/18/9/b7642b5b-7121-48a2-945a-9df0ca92c177.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">대상웰라이프 뉴케어 마이밀 바나나</p>
										<p class="price">43,110원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 4 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://shopping-phinf.pstatic.net/main_5761002/5761002283.20150128173135.jpg?type=f300">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">[빙그레] 바나나맛 우유(240ml4개) 960ml</p>
										<p class="price">4,580 원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 5 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Pressimages/11/320/100788211_0.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">푸르밀_생과즙바나나우유_225ML*6</p>
										<p class="price"> 3,280원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 6 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="http://image.homeplus.co.kr/UserFiles/Goods/320/145628287_0.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">서울_바나나우유_200ML*3</p>
										<p class="price"> 2,390원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 7 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://contents.lotteon.com/itemimage/LM/88/01/12/17/59/96/7_/00/1/LM8801121759967_001_1.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">매일 상하목장 유기농 멸균 우유 (바나나)(125ML*3입)</p>
										<p class="price">2,380원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 8 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail7.coupangcdn.com/thumbnails/remote/492x492ex/image/product/image/vendoritem/2018/11/08/3601086321/c0879d10-cfad-4b9f-ac65-6a7faff5a4eb.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">파스퇴르 전용목장 1급A 원유 바나나우유</p>
										<p class="price">11,930원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 9 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://shopping-phinf.pstatic.net/main_2285035/22850351426.20200513172849.jpg?type=f300">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">매일 소화가 잘되는우유 바나나 190ml*6입</p>
										<p class="price">5,380 원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- MODAL ITEM 10 -->
							  <div class="col-md-3 d-flex ftco-animate">
								<div class="blog-entry align-self-stretch">
								  <div class="img">
									<a href="#">
										<img class="product_img" src="https://thumbnail9.coupangcdn.com/thumbnails/remote/230x230ex/image/retail/images/2019/09/27/17/5/3288a7a8-79e4-4f66-bee3-0ad3796e0592.jpg">
									</a>
								  </div>
								  <div class="text mt-3 d-block">
									<a href="#">
										<p class="product">빙그레 바나나맛우유</p>
										<p class="price">8,700원</p>
									</a>
								  </div>
								</div>
							  </div>
							  <!-- ========== End of Modal Item ========== -->
							</div>
							</div>
						</section>

					</div>
					<!-- <div class="modal-footer">
					  <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
					</div> -->
				  </div>
				</div>
			</div>

			

    	</div>
    </section>
		

    <!-- ================================== FOOTER ================================== -->
    <tiles:insertAttribute name="footer"/>

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>

  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/jquery.waypoints.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>
  <script src="js/jquery.animateNumber.min.js"></script>
  <script src="js/bootstrap-datepicker.js"></script>
  <script src="js/jquery.timepicker.min.js"></script>
  <script src="js/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>
    
  </body>
</html>