# language: es
Característica: Consulta de detalles del vendedor

  @manual
  @manual-result:passed
  Escenario: Verificar los detalles del vendedor de un producto
    Dado que estoy en la página de detalles de un producto en Amazon
    Cuando busco los detalles del vendedor del producto
    Entonces puedo ver información relevante sobre el vendedor, como su nombre y reputación