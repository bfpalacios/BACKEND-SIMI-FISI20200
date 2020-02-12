(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["modules-home-home-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/feed.component.html":
/*!*********************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/feed.component.html ***!
  \*********************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div style=\"background-color: #e9ebee;\">\r\n  <div class=\"pl-1 pr-1 pb-3 text-center font-weight-light\" style=\"padding-top: 54px;\">\r\n    <div class=\"row m-0\">\r\n      <div class=\"col-lg-4 col-md-6 col-12\" style=\"position: relative;margin: 0px !important; padding: 0px !important;\">\r\n        <div class=\"section-feed mt-2\">\r\n          <div class=\"section-photo\">\r\n          </div>\r\n          <div class=\"mt-1\">\r\n            <span class=\"f-16\">Brandon Duvan Saenz Falcón</span>\r\n          </div>\r\n          <div class=\"mt-2 mb-2\">\r\n            <span class=\"section-codigo\">16200049</span>\r\n          </div>\r\n          <div class=\"mt-1\">\r\n            <i class=\"mdi mdi-school-outline\"></i><br />\r\n            <span class=\"section-universidad\">Universidad Nacional Mayor de San Marcos</span>\r\n          </div>\r\n          <div class=\"mt-3\">\r\n            <i class=\"mdi mdi-email-outline\"></i><br />\r\n            <span class=\"section-email\">duvanbradbrid@gmail.com</span>\r\n          </div>\r\n          <div class=\"mt-3 mb-2\">\r\n            <i class=\"mdi mdi-cellphone\"></i><br />\r\n            <span class=\"section-email\">+51 993420344</span>\r\n          </div>\r\n          <div>\r\n            <button class=\"btn-blue-d\" (click)=\"informacionAcademica()\">\r\n              <i class=\"mdi mdi-book-information-variant\" style=\"font-size: 30px;\"></i><br />\r\n              Información Académica\r\n            </button>\r\n            <button class=\"btn-black-blue-d\">\r\n              <i class=\"mdi mdi-account\" style=\"font-size: 30px;\"></i><br />\r\n              Cuenta de Usuario\r\n            </button>\r\n          </div>\r\n        </div>\r\n        <div class=\"mt-2\">\r\n          <button class=\"btn-light-blue-d mb-2\" (click)=\"programacionCursos()\">\r\n            <i class=\"mdi mdi-tablet-dashboard\" style=\"font-size: 50px;\"></i><br />\r\n            Plan de Estudios \r\n          </button>\r\n          <button class=\"btn-light-blue-d\" (click)=\"planEstudios()\">\r\n            <i class=\"mdi  mdi-progress-clock\" style=\"font-size: 50px;\"></i><br />\r\n            <span class=\"font-weight-light\">Programación de cursos</span>\r\n          </button>\r\n        </div>\r\n        \r\n      </div>\r\n      <div class=\"col-lg-4 col-md-6 col-12\" style=\"margin: 0px !important; padding: 0px !important;\">\r\n        <app-news></app-news>\r\n      </div>\r\n      <div class=\"col-lg-4 col-12\" style=\"margin: 0px !important; padding: 0px !important;\">\r\n        <app-lenguajes></app-lenguajes>\r\n        <app-info-matricula></app-info-matricula>\r\n      </div>\r\n    </div>\r\n  </div>");

/***/ }),

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/info-matricula/info-matricula.component.html":
/*!**********************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/info-matricula/info-matricula.component.html ***!
  \**********************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"info-matricula\">\r\n    <div>\r\n        <button class=\"btn-blue-d mb-2\" (click)=\"goCicloAcademico()\">\r\n            <i class=\"mdi mdi-book-open-variant\" style=\"font-size: 25px;\"></i><br />\r\n            Ciclo Académico\r\n        </button>\r\n        <button class=\"btn-blue-d mb-2\" (click)=\"goConceptoPago()\">\r\n            <i class=\"mdi mdi-credit-card-outline\" style=\"font-size: 25px;\"></i><br />\r\n            Conceptos de Pago\r\n        </button>\r\n        <button class=\"btn-blue-d\" (click)=\"goMatriculaOnline()\">\r\n            <i class=\"mdi mdi-book-variant-multiple\" style=\"font-size: 25px;\"></i><br />\r\n            Matrícula Online\r\n        </button>\r\n    </div>\r\n</div>");

/***/ }),

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/lenguajes/lenguajes.component.html":
/*!************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/lenguajes/lenguajes.component.html ***!
  \************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"section-feed-idiomas mt-2\">\r\n    <div>\r\n        <span *ngFor=\"let photo of photos\">\r\n            <img src={{photo.image}} style=\"width: 33.3%;\" class=\"idiomas-bg\"></span>\r\n    </div>\r\n</div>");

/***/ }),

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/news/news.component.html":
/*!**************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/news/news.component.html ***!
  \**************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div class=\"section-feed-news\">\r\n    <div class=\"card-feed\" style=\"color: black\">\r\n        <div class=\"card-header\">\r\n            <span>Centro de Idiomas</span>\r\n        </div>\r\n        <div class=\"section-new\" style=\"text-align: left;\">\r\n            <table>\r\n                <tbody>\r\n                    <tr>\r\n                        <td>\r\n                            <div class=\"section-photo-new center-content mr-2\">\r\n                                <img src=\"favicon.ico\" width=\"30\" />\r\n                            </div>\r\n                        </td>\r\n                        <td style=\" font-weight: bolder; width: 100%;\">\r\n                            <div>\r\n                                <span style=\"font-size: 16px;\">Bienvenido al Centro de Idiomas</span>\r\n                            </div>\r\n                            <div style=\"margin-top: -5px;\">\r\n                                <span style=\"font-size: 13px;\">Aquí encontrarás el idioma que estabas buscando.</span>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\">\r\n                            <div class=\"mt-1 mr-2\">\r\n                                <div style=\"text-align: center;\">\r\n                                    <button class=\"btn-ver-idiomas\">\r\n                                        Ver idiomas\r\n                                    </button>\r\n                                </div>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                </tbody>\r\n            </table>\r\n            <hr />\r\n        </div>\r\n        <div class=\"section-new\" style=\"text-align: left;\">\r\n            <table>\r\n                <tbody>\r\n                    <tr>\r\n                        <td>\r\n                            <div class=\"section-photo-new center-content mr-2\">\r\n                                <img src=\"favicon.ico\" width=\"30\" />\r\n                            </div>\r\n                        </td>\r\n                        <td style=\" font-weight: bolder; width: 100%;\">\r\n                            <div>\r\n                                <span style=\"font-size: 16px;\">¡Descubre en qué nivel estás!</span>\r\n                            </div>\r\n                            <div style=\"margin-top: -5px;\">\r\n                                <span style=\"font-size: 13px;\">Elige una de estas opciones</span>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\">\r\n                            <div class=\"mt-1 mr-2\">\r\n                                <div>\r\n                                    <button class=\"btn-examen-clasificacion\">\r\n                                        <i class=\"mdi mdi-file-document-box-check-outline\"\r\n                                            style=\"font-size: 35px;\"></i><br />\r\n                                        Examen de Clasificación\r\n                                    </button>\r\n                                </div>\r\n                                <div>\r\n                                    <button class=\"btn-examen-clasificacion\">\r\n                                        <i class=\"mdi mdi-file-document-box-plus-outline\"\r\n                                            style=\"font-size: 35px;\"></i><br />\r\n                                        Examen de Rezagados\r\n                                    </button>\r\n                                </div>\r\n                            </div>\r\n                        </td>\r\n                    </tr>\r\n                </tbody>\r\n            </table>\r\n            <hr />\r\n        </div>\r\n    </div>\r\n\r\n</div>");

/***/ }),

/***/ "./src/app/modules/home/feed/feed.component.css":
/*!******************************************************!*\
  !*** ./src/app/modules/home/feed/feed.component.css ***!
  \******************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = (".section-feed{\r\n    background-color: rgb(26, 26, 26);\r\n    padding: 10px 0px 0px 0px;\r\n    color: white;\r\n  }\r\n\r\n  .section-photo{\r\n    background-color: #ebebeb;\r\n    border-radius: 35px;\r\n    width: 70px;\r\n    height: 70px;\r\n    display: inline-block;\r\n  }\r\n\r\n  .f-16{\r\n      font-size: 16px;\r\n  }\r\n\r\n  .section-codigo{\r\n    background-color: #20639b;\r\n    border-radius: 7px;\r\n    padding: 5.5px 9.5px;\r\n    margin: 5px;\r\n    font-size: 14px;\r\n    color: white;\r\n  }\r\n\r\n  .section-universidad{\r\n    background-color: #204564;\r\n    border-radius: 4px;\r\n    padding: 5.5px 9.5px;\r\n    margin: 5px;\r\n    font-size: 14px;\r\n    color: white;\r\n  }\r\n\r\n  .section-email{\r\n    background-color: #204564;\r\n    border-radius: 4px;\r\n    padding: 5.5px 9.5px;\r\n    margin: 5px;\r\n    font-size: 14px;\r\n    color: white;\r\n  }\r\n\r\n  .btn-blue-d{\r\n    font-size: 13px;\r\n    width: 50%;\r\n    border: 0px;\r\n    background-color: #20639b;\r\n    color: white;\r\n    padding: 8px;\r\n    font-weight: lighter;\r\n}\r\n\r\n  .btn-light-blue-d{\r\n  font-size: 13px;\r\n  width: 100%;\r\n  border: 0px;\r\n  font-size: 20px;\r\n  background-color: #2196f3;\r\n  color: white;\r\n  padding: 8px;\r\n  font-weight: lighter;\r\n}\r\n\r\n  .btn-light-blue-d:hover{\r\n  background-color: #0a83e6;\r\n}\r\n\r\n  .btn-blue-d:hover{\r\n    background-color: #0f4c7e;\r\n}\r\n\r\n  .btn-black-blue-d{\r\n    font-size: 13px;\r\n    width: 50%;\r\n    border: 0px;\r\n    background-color: #204564;\r\n    color: white;\r\n    padding: 8px;\r\n    font-weight: lighter;\r\n}\r\n\r\n  .btn-black-blue-d:hover{\r\n    background-color: #0f4c7e;\r\n}\r\n\r\n  .f-14{\r\n    font-size: 14px;\r\n}\r\n\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvZmVlZC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksaUNBQWlDO0lBQ2pDLHlCQUF5QjtJQUN6QixZQUFZO0VBQ2Q7O0VBRUE7SUFDRSx5QkFBeUI7SUFDekIsbUJBQW1CO0lBQ25CLFdBQVc7SUFDWCxZQUFZO0lBQ1oscUJBQXFCO0VBQ3ZCOztFQUVBO01BQ0ksZUFBZTtFQUNuQjs7RUFFQTtJQUNFLHlCQUF5QjtJQUN6QixrQkFBa0I7SUFDbEIsb0JBQW9CO0lBQ3BCLFdBQVc7SUFDWCxlQUFlO0lBQ2YsWUFBWTtFQUNkOztFQUVBO0lBQ0UseUJBQXlCO0lBQ3pCLGtCQUFrQjtJQUNsQixvQkFBb0I7SUFDcEIsV0FBVztJQUNYLGVBQWU7SUFDZixZQUFZO0VBQ2Q7O0VBRUE7SUFDRSx5QkFBeUI7SUFDekIsa0JBQWtCO0lBQ2xCLG9CQUFvQjtJQUNwQixXQUFXO0lBQ1gsZUFBZTtJQUNmLFlBQVk7RUFDZDs7RUFFRjtJQUNJLGVBQWU7SUFDZixVQUFVO0lBQ1YsV0FBVztJQUNYLHlCQUF5QjtJQUN6QixZQUFZO0lBQ1osWUFBWTtJQUNaLG9CQUFvQjtBQUN4Qjs7RUFFQTtFQUNFLGVBQWU7RUFDZixXQUFXO0VBQ1gsV0FBVztFQUNYLGVBQWU7RUFDZix5QkFBeUI7RUFDekIsWUFBWTtFQUNaLFlBQVk7RUFDWixvQkFBb0I7QUFDdEI7O0VBRUE7RUFDRSx5QkFBeUI7QUFDM0I7O0VBRUE7SUFDSSx5QkFBeUI7QUFDN0I7O0VBRUE7SUFDSSxlQUFlO0lBQ2YsVUFBVTtJQUNWLFdBQVc7SUFDWCx5QkFBeUI7SUFDekIsWUFBWTtJQUNaLFlBQVk7SUFDWixvQkFBb0I7QUFDeEI7O0VBRUE7SUFDSSx5QkFBeUI7QUFDN0I7O0VBRUE7SUFDSSxlQUFlO0FBQ25CIiwiZmlsZSI6InNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvZmVlZC5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLnNlY3Rpb24tZmVlZHtcclxuICAgIGJhY2tncm91bmQtY29sb3I6IHJnYigyNiwgMjYsIDI2KTtcclxuICAgIHBhZGRpbmc6IDEwcHggMHB4IDBweCAwcHg7XHJcbiAgICBjb2xvcjogd2hpdGU7XHJcbiAgfVxyXG5cclxuICAuc2VjdGlvbi1waG90b3tcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICNlYmViZWI7XHJcbiAgICBib3JkZXItcmFkaXVzOiAzNXB4O1xyXG4gICAgd2lkdGg6IDcwcHg7XHJcbiAgICBoZWlnaHQ6IDcwcHg7XHJcbiAgICBkaXNwbGF5OiBpbmxpbmUtYmxvY2s7XHJcbiAgfVxyXG5cclxuICAuZi0xNntcclxuICAgICAgZm9udC1zaXplOiAxNnB4O1xyXG4gIH1cclxuXHJcbiAgLnNlY3Rpb24tY29kaWdve1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogIzIwNjM5YjtcclxuICAgIGJvcmRlci1yYWRpdXM6IDdweDtcclxuICAgIHBhZGRpbmc6IDUuNXB4IDkuNXB4O1xyXG4gICAgbWFyZ2luOiA1cHg7XHJcbiAgICBmb250LXNpemU6IDE0cHg7XHJcbiAgICBjb2xvcjogd2hpdGU7XHJcbiAgfVxyXG5cclxuICAuc2VjdGlvbi11bml2ZXJzaWRhZHtcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICMyMDQ1NjQ7XHJcbiAgICBib3JkZXItcmFkaXVzOiA0cHg7XHJcbiAgICBwYWRkaW5nOiA1LjVweCA5LjVweDtcclxuICAgIG1hcmdpbjogNXB4O1xyXG4gICAgZm9udC1zaXplOiAxNHB4O1xyXG4gICAgY29sb3I6IHdoaXRlO1xyXG4gIH1cclxuXHJcbiAgLnNlY3Rpb24tZW1haWx7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjA0NTY0O1xyXG4gICAgYm9yZGVyLXJhZGl1czogNHB4O1xyXG4gICAgcGFkZGluZzogNS41cHggOS41cHg7XHJcbiAgICBtYXJnaW46IDVweDtcclxuICAgIGZvbnQtc2l6ZTogMTRweDtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxuICB9XHJcblxyXG4uYnRuLWJsdWUtZHtcclxuICAgIGZvbnQtc2l6ZTogMTNweDtcclxuICAgIHdpZHRoOiA1MCU7XHJcbiAgICBib3JkZXI6IDBweDtcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICMyMDYzOWI7XHJcbiAgICBjb2xvcjogd2hpdGU7XHJcbiAgICBwYWRkaW5nOiA4cHg7XHJcbiAgICBmb250LXdlaWdodDogbGlnaHRlcjtcclxufVxyXG5cclxuLmJ0bi1saWdodC1ibHVlLWR7XHJcbiAgZm9udC1zaXplOiAxM3B4O1xyXG4gIHdpZHRoOiAxMDAlO1xyXG4gIGJvcmRlcjogMHB4O1xyXG4gIGZvbnQtc2l6ZTogMjBweDtcclxuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjE5NmYzO1xyXG4gIGNvbG9yOiB3aGl0ZTtcclxuICBwYWRkaW5nOiA4cHg7XHJcbiAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XHJcbn1cclxuXHJcbi5idG4tbGlnaHQtYmx1ZS1kOmhvdmVye1xyXG4gIGJhY2tncm91bmQtY29sb3I6ICMwYTgzZTY7XHJcbn1cclxuXHJcbi5idG4tYmx1ZS1kOmhvdmVye1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogIzBmNGM3ZTtcclxufVxyXG5cclxuLmJ0bi1ibGFjay1ibHVlLWR7XHJcbiAgICBmb250LXNpemU6IDEzcHg7XHJcbiAgICB3aWR0aDogNTAlO1xyXG4gICAgYm9yZGVyOiAwcHg7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjA0NTY0O1xyXG4gICAgY29sb3I6IHdoaXRlO1xyXG4gICAgcGFkZGluZzogOHB4O1xyXG4gICAgZm9udC13ZWlnaHQ6IGxpZ2h0ZXI7XHJcbn1cclxuXHJcbi5idG4tYmxhY2stYmx1ZS1kOmhvdmVye1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogIzBmNGM3ZTtcclxufVxyXG5cclxuLmYtMTR7XHJcbiAgICBmb250LXNpemU6IDE0cHg7XHJcbn1cclxuIl19 */");

/***/ }),

/***/ "./src/app/modules/home/feed/feed.component.ts":
/*!*****************************************************!*\
  !*** ./src/app/modules/home/feed/feed.component.ts ***!
  \*****************************************************/
/*! exports provided: FeedComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FeedComponent", function() { return FeedComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");



let FeedComponent = class FeedComponent {
    constructor(router) {
        this.router = router;
    }
    ngOnInit() {
    }
    informacionAcademica() {
        this.router.navigate(['profile/informacionAcademica']).then();
    }
    programacionCursos() {
        this.router.navigate(['periodo-academico/programacionCurso']).then();
    }
    planEstudios() {
        this.router.navigate(['centro-idiomas/planEstudio']).then();
    }
};
FeedComponent.ctorParameters = () => [
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"] }
];
FeedComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
        selector: 'app-feed',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./feed.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/feed.component.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./feed.component.css */ "./src/app/modules/home/feed/feed.component.css")).default]
    })
], FeedComponent);



/***/ }),

/***/ "./src/app/modules/home/feed/info-matricula/info-matricula.component.css":
/*!*******************************************************************************!*\
  !*** ./src/app/modules/home/feed/info-matricula/info-matricula.component.css ***!
  \*******************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = (".info-matricula{\r\n    margin-top: 5px;\r\n    color: white;\r\n    font-size: 13.5px;\r\n}\r\n\r\n.btn-blue-d:hover{\r\n    background-color: #da372c;\r\n}\r\n\r\n.btn-blue-d{\r\n    font-size: 16px;\r\n    width: 100%;\r\n    border: 0px;\r\n    background-color: #f44336;\r\n    color: white;\r\n    padding: 8px;\r\n    font-weight: lighter;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvaW5mby1tYXRyaWN1bGEvaW5mby1tYXRyaWN1bGEuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLGVBQWU7SUFDZixZQUFZO0lBQ1osaUJBQWlCO0FBQ3JCOztBQUVBO0lBQ0kseUJBQXlCO0FBQzdCOztBQUVBO0lBQ0ksZUFBZTtJQUNmLFdBQVc7SUFDWCxXQUFXO0lBQ1gseUJBQXlCO0lBQ3pCLFlBQVk7SUFDWixZQUFZO0lBQ1osb0JBQW9CO0FBQ3hCIiwiZmlsZSI6InNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvaW5mby1tYXRyaWN1bGEvaW5mby1tYXRyaWN1bGEuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIi5pbmZvLW1hdHJpY3VsYXtcclxuICAgIG1hcmdpbi10b3A6IDVweDtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxuICAgIGZvbnQtc2l6ZTogMTMuNXB4O1xyXG59XHJcblxyXG4uYnRuLWJsdWUtZDpob3ZlcntcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICNkYTM3MmM7XHJcbn1cclxuXHJcbi5idG4tYmx1ZS1ke1xyXG4gICAgZm9udC1zaXplOiAxNnB4O1xyXG4gICAgd2lkdGg6IDEwMCU7XHJcbiAgICBib3JkZXI6IDBweDtcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICNmNDQzMzY7XHJcbiAgICBjb2xvcjogd2hpdGU7XHJcbiAgICBwYWRkaW5nOiA4cHg7XHJcbiAgICBmb250LXdlaWdodDogbGlnaHRlcjtcclxufSJdfQ== */");

/***/ }),

/***/ "./src/app/modules/home/feed/info-matricula/info-matricula.component.ts":
/*!******************************************************************************!*\
  !*** ./src/app/modules/home/feed/info-matricula/info-matricula.component.ts ***!
  \******************************************************************************/
/*! exports provided: InfoMatriculaComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InfoMatriculaComponent", function() { return InfoMatriculaComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");



let InfoMatriculaComponent = class InfoMatriculaComponent {
    constructor(router) {
        this.router = router;
    }
    ngOnInit() {
    }
    goMatriculaOnline() {
        this.router.navigate(['periodo-academico/matriculaOnline']).then();
    }
    goCicloAcademico() {
        this.router.navigate(['periodo-academico/cicloAcademico']).then();
    }
    goConceptoPago() {
        this.router.navigate(['centro-idiomas/ConceptoPago']).then();
    }
};
InfoMatriculaComponent.ctorParameters = () => [
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"] }
];
InfoMatriculaComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
        selector: 'app-info-matricula',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./info-matricula.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/info-matricula/info-matricula.component.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./info-matricula.component.css */ "./src/app/modules/home/feed/info-matricula/info-matricula.component.css")).default]
    })
], InfoMatriculaComponent);



/***/ }),

/***/ "./src/app/modules/home/feed/lenguajes/lenguajes.component.css":
/*!*********************************************************************!*\
  !*** ./src/app/modules/home/feed/lenguajes/lenguajes.component.css ***!
  \*********************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = (".section-feed-idiomas{\r\n    background-color: rgb(26, 26, 26);\r\n    padding: 10px 10px 10px 10px;\r\n    color: white;\r\n  }\r\n\r\n  \r\n\r\n  .idiomas-bg{\r\n    cursor: pointer;\r\n}\r\n\r\n  \r\n\r\n  .idiomas-bg:hover{\r\n    background-color: rgba(243, 243, 243, .1);\r\n    border-radius: 8px;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvbGVuZ3VhamVzL2xlbmd1YWplcy5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksaUNBQWlDO0lBQ2pDLDRCQUE0QjtJQUM1QixZQUFZO0VBQ2Q7Ozs7RUFJQTtJQUNFLGVBQWU7QUFDbkI7Ozs7RUFDQTtJQUNJLHlDQUF5QztJQUN6QyxrQkFBa0I7QUFDdEIiLCJmaWxlIjoic3JjL2FwcC9tb2R1bGVzL2hvbWUvZmVlZC9sZW5ndWFqZXMvbGVuZ3VhamVzLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuc2VjdGlvbi1mZWVkLWlkaW9tYXN7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiByZ2IoMjYsIDI2LCAyNik7XHJcbiAgICBwYWRkaW5nOiAxMHB4IDEwcHggMTBweCAxMHB4O1xyXG4gICAgY29sb3I6IHdoaXRlO1xyXG4gIH1cclxuXHJcbiAgXHJcblxyXG4gIC5pZGlvbWFzLWJne1xyXG4gICAgY3Vyc29yOiBwb2ludGVyO1xyXG59XHJcbi5pZGlvbWFzLWJnOmhvdmVye1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogcmdiYSgyNDMsIDI0MywgMjQzLCAuMSk7XHJcbiAgICBib3JkZXItcmFkaXVzOiA4cHg7XHJcbn0iXX0= */");

/***/ }),

/***/ "./src/app/modules/home/feed/lenguajes/lenguajes.component.ts":
/*!********************************************************************!*\
  !*** ./src/app/modules/home/feed/lenguajes/lenguajes.component.ts ***!
  \********************************************************************/
/*! exports provided: LenguajesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LenguajesComponent", function() { return LenguajesComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");


let LenguajesComponent = class LenguajesComponent {
    constructor() {
        this.photos = [];
        this.photos.push({ image: 'assets/logo-language/ingles.svg' }, { image: 'assets/logo-language/coreano.svg' }, { image: 'assets/logo-language/aleman.svg' }, { image: 'assets/logo-language/quechua.svg' }, { image: 'assets/logo-language/italiano.svg' }, { image: 'assets/logo-language/portugues.svg' }, { image: 'assets/logo-language/japones.svg' }, { image: 'assets/logo-language/frances.svg' });
    }
    ngOnInit() {
    }
};
LenguajesComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
        selector: 'app-lenguajes',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./lenguajes.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/lenguajes/lenguajes.component.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./lenguajes.component.css */ "./src/app/modules/home/feed/lenguajes/lenguajes.component.css")).default]
    })
], LenguajesComponent);



/***/ }),

/***/ "./src/app/modules/home/feed/news/news.component.css":
/*!***********************************************************!*\
  !*** ./src/app/modules/home/feed/news/news.component.css ***!
  \***********************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = (".section-new{\r\n    margin: 2px;\r\n}\r\n\r\n.btn-examen-clasificacion{\r\n    background-color: #ee7600;\r\n    font-size: 20px;\r\n    color: white;\r\n    border: 0px;\r\n    padding: 8px;\r\n    width: 100%;\r\n    margin: 2px;\r\n    font-weight: lighter;\r\n}\r\n\r\n.btn-examen-clasificacion:hover{\r\n  background-color: #f1390b;\r\n}\r\n\r\n.btn-ver-idiomas{\r\n    background-color: #3f51b5;\r\n    font-size: 13px;\r\n    color: white;\r\n    border: 0px;\r\n    padding: 8px;\r\n    margin: 2px;\r\n    font-weight: lighter;\r\n}\r\n\r\n.btn-ver-idiomas:hover{\r\n  background-color: #213397;\r\n}\r\n\r\n.card-feed{\r\n    background-color: white;\r\n}\r\n\r\n.section-feed-news{\r\n\r\n    padding: 10px 10px 10px 10px;\r\n    color: white;\r\n  }\r\n\r\n.section-photo-new{\r\n    background-color: #ebebeb;\r\n    border-radius: 35px;\r\n    width: 50px;\r\n    height: 50px;\r\n    display: inline-block;\r\n  }\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvbmV3cy9uZXdzLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7SUFDSSxXQUFXO0FBQ2Y7O0FBRUE7SUFDSSx5QkFBeUI7SUFDekIsZUFBZTtJQUNmLFlBQVk7SUFDWixXQUFXO0lBQ1gsWUFBWTtJQUNaLFdBQVc7SUFDWCxXQUFXO0lBQ1gsb0JBQW9CO0FBQ3hCOztBQUVBO0VBQ0UseUJBQXlCO0FBQzNCOztBQUVBO0lBQ0kseUJBQXlCO0lBQ3pCLGVBQWU7SUFDZixZQUFZO0lBQ1osV0FBVztJQUNYLFlBQVk7SUFDWixXQUFXO0lBQ1gsb0JBQW9CO0FBQ3hCOztBQUVBO0VBQ0UseUJBQXlCO0FBQzNCOztBQUVBO0lBQ0ksdUJBQXVCO0FBQzNCOztBQUVBOztJQUVJLDRCQUE0QjtJQUM1QixZQUFZO0VBQ2Q7O0FBRUE7SUFDRSx5QkFBeUI7SUFDekIsbUJBQW1CO0lBQ25CLFdBQVc7SUFDWCxZQUFZO0lBQ1oscUJBQXFCO0VBQ3ZCIiwiZmlsZSI6InNyYy9hcHAvbW9kdWxlcy9ob21lL2ZlZWQvbmV3cy9uZXdzLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuc2VjdGlvbi1uZXd7XHJcbiAgICBtYXJnaW46IDJweDtcclxufVxyXG5cclxuLmJ0bi1leGFtZW4tY2xhc2lmaWNhY2lvbntcclxuICAgIGJhY2tncm91bmQtY29sb3I6ICNlZTc2MDA7XHJcbiAgICBmb250LXNpemU6IDIwcHg7XHJcbiAgICBjb2xvcjogd2hpdGU7XHJcbiAgICBib3JkZXI6IDBweDtcclxuICAgIHBhZGRpbmc6IDhweDtcclxuICAgIHdpZHRoOiAxMDAlO1xyXG4gICAgbWFyZ2luOiAycHg7XHJcbiAgICBmb250LXdlaWdodDogbGlnaHRlcjtcclxufVxyXG5cclxuLmJ0bi1leGFtZW4tY2xhc2lmaWNhY2lvbjpob3ZlcntcclxuICBiYWNrZ3JvdW5kLWNvbG9yOiAjZjEzOTBiO1xyXG59XHJcblxyXG4uYnRuLXZlci1pZGlvbWFze1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogIzNmNTFiNTtcclxuICAgIGZvbnQtc2l6ZTogMTNweDtcclxuICAgIGNvbG9yOiB3aGl0ZTtcclxuICAgIGJvcmRlcjogMHB4O1xyXG4gICAgcGFkZGluZzogOHB4O1xyXG4gICAgbWFyZ2luOiAycHg7XHJcbiAgICBmb250LXdlaWdodDogbGlnaHRlcjtcclxufVxyXG5cclxuLmJ0bi12ZXItaWRpb21hczpob3ZlcntcclxuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMjEzMzk3O1xyXG59XHJcblxyXG4uY2FyZC1mZWVke1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogd2hpdGU7XHJcbn1cclxuXHJcbi5zZWN0aW9uLWZlZWQtbmV3c3tcclxuXHJcbiAgICBwYWRkaW5nOiAxMHB4IDEwcHggMTBweCAxMHB4O1xyXG4gICAgY29sb3I6IHdoaXRlO1xyXG4gIH1cclxuXHJcbiAgLnNlY3Rpb24tcGhvdG8tbmV3e1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogI2ViZWJlYjtcclxuICAgIGJvcmRlci1yYWRpdXM6IDM1cHg7XHJcbiAgICB3aWR0aDogNTBweDtcclxuICAgIGhlaWdodDogNTBweDtcclxuICAgIGRpc3BsYXk6IGlubGluZS1ibG9jaztcclxuICB9Il19 */");

/***/ }),

/***/ "./src/app/modules/home/feed/news/news.component.ts":
/*!**********************************************************!*\
  !*** ./src/app/modules/home/feed/news/news.component.ts ***!
  \**********************************************************/
/*! exports provided: NewsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NewsComponent", function() { return NewsComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");


let NewsComponent = class NewsComponent {
    constructor() {
        this.news = [1];
    }
    ngOnInit() {
    }
};
NewsComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
        selector: 'app-news',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./news.component.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/feed/news/news.component.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./news.component.css */ "./src/app/modules/home/feed/news/news.component.css")).default]
    })
], NewsComponent);



/***/ }),

/***/ "./src/app/modules/home/home-routing.module.ts":
/*!*****************************************************!*\
  !*** ./src/app/modules/home/home-routing.module.ts ***!
  \*****************************************************/
/*! exports provided: HomeRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeRoutingModule", function() { return HomeRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _feed_feed_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./feed/feed.component */ "./src/app/modules/home/feed/feed.component.ts");




const routes = [
    {
        path: '',
        component: _feed_feed_component__WEBPACK_IMPORTED_MODULE_3__["FeedComponent"],
    },
    {
        path: '**',
        redirectTo: ''
    },
];
let HomeRoutingModule = class HomeRoutingModule {
};
HomeRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })
], HomeRoutingModule);



/***/ }),

/***/ "./src/app/modules/home/home.module.ts":
/*!*********************************************!*\
  !*** ./src/app/modules/home/home.module.ts ***!
  \*********************************************/
/*! exports provided: HomeModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeModule", function() { return HomeModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm2015/common.js");
/* harmony import */ var _feed_feed_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./feed/feed.component */ "./src/app/modules/home/feed/feed.component.ts");
/* harmony import */ var _home_routing_module__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./home-routing.module */ "./src/app/modules/home/home-routing.module.ts");
/* harmony import */ var _feed_news_news_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./feed/news/news.component */ "./src/app/modules/home/feed/news/news.component.ts");
/* harmony import */ var _feed_lenguajes_lenguajes_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./feed/lenguajes/lenguajes.component */ "./src/app/modules/home/feed/lenguajes/lenguajes.component.ts");
/* harmony import */ var _feed_info_matricula_info_matricula_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./feed/info-matricula/info-matricula.component */ "./src/app/modules/home/feed/info-matricula/info-matricula.component.ts");








let HomeModule = class HomeModule {
};
HomeModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        declarations: [_feed_feed_component__WEBPACK_IMPORTED_MODULE_3__["FeedComponent"], _feed_news_news_component__WEBPACK_IMPORTED_MODULE_5__["NewsComponent"], _feed_lenguajes_lenguajes_component__WEBPACK_IMPORTED_MODULE_6__["LenguajesComponent"], _feed_info_matricula_info_matricula_component__WEBPACK_IMPORTED_MODULE_7__["InfoMatriculaComponent"]],
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _home_routing_module__WEBPACK_IMPORTED_MODULE_4__["HomeRoutingModule"]
        ]
    })
], HomeModule);



/***/ })

}]);
//# sourceMappingURL=modules-home-home-module-es2015.js.map