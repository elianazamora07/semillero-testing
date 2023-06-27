# language: es
Característica: filtrar items por rango de precio
  Yo como comprador
  Quiero ver  si está disponible el item

  Escenario: filtrar items por rango de precio
    Dado que Carlos está en la página de resultados de búsqueda de "celulares"
    Cuando aplico el filtro de rango por precio de 100 a 400
    Entonces se muestran solo items que se encuentran dentro del rango de precios especificado




