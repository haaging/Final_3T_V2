<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />

  <title>Menu</title>

  <!-- slider stylesheet -->
  <link rel="stylesheet" type="text/css"
    href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css" />

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

  <!-- fonts style -->
  <link href="https://fonts.googleapis.com/css?family=Dosis:400,500|Poppins:400,700&display=swap" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
  
  <!-- FONT jua -->
  <style>
  @import url('https://fonts.googleapis.com/css?family=Jua:400');
  li
  {
  	font-family: "Jua";
  	font-weight: Regular;
  	font-size: large;
  }
  </style>
</head>
    <!-- header section strats -->
    <header class="header_section" style="background-color: white; ">
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="index.html">
            <img src="./images/logo_main.png" alt="png_logo" style="width: 85px;">
           
          </a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <div class="d-flex mx-auto flex-column flex-lg-row align-items-center">
              <ul class="navbar-nav  ">
                <li class="nav-item">
                  <a class="nav-link" href="service.html" >서비스 소개 </a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="pet.html">대리산책 </a>
                </li> 
                <li class="nav-item">
                  <a class="nav-link" href="clinic.html"> 펫시팅</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="contact.html">고객지원</a>
                </li>
				    
                <li class="nav-item dropdown" style="font-size: medium;">
				  <a class="nav-link dropdown-toggle pl-0" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    <img src="https://s3.eu-central-1.amazonaws.com/bootstrapbaymisc/blog/24_days_bootstrap/fox.jpg" width="30" height="30" class="rounded-circle">
				   
				    <span style="font-style: italic; font-weight: lighter; color: orange;">불타는 맨발산책</span>
				  </a>
				  <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
				    <a class="dropdown-item" href="#">알림  
				    <span class="position-absolute top-0 start-100 translate-middle p-1 bg-danger border border-light rounded-circle">
  					</span>
  					</a>
				    <a class="dropdown-item" href="#">찜한 목록</a>
				    <a class="dropdown-item" href="#">마이페이지</a>
				    <a class="dropdown-item" href="#">로그아웃</a>
				  </div>
				</li>
 
				  </ul>
				 
            </div>
            
          </div>
        </nav>
      </div>
    </header>
    <!-- end header section -->
