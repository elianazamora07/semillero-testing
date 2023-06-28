# language: es
Característica: Consulta de reseñas de productos

  @manual
  @manual-result:passed
  Escenario: Verificar las reseñas de un producto
    Dado que estoy en la página de detalles de un producto en Amazon
    Cuando busco las reseñas y calificaciones del producto
    Entonces puedo ver la lista de reseñas y la puntuación promedio del producto