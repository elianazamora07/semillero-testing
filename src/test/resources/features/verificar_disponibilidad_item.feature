# language: es
Característica: verificar la disponibilidad de un item
  Yo como comprador
  Quiero ver  si está  disponible el item

  Escenario: verificar si el item está disponible
    Cuando realizo una busqueda de un item "iphone 14"
    Entonces el item tiene una etiqueta <disponible> indicando que esta en stock
