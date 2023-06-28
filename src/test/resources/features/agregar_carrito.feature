# language: es
Característica: agregar al carrito
  Yo como comprador
  Quiero agregar elementos a un carrito de compra
  Para posteriormente comprar

  Escenario: agregar un control de PC al carrito de compras
    Cuando agrego un "control de pc" al carrito
    Entonces debe verse 1 item en el carrito de compras


  Escenario: agregar 2 items al carrito de compras
    Cuando Carlos agrega al carrito los items
      | "control de pc"  |
      | "teclado gaming" |
    Entonces debe verse 2 items en el carrito de compras


  Escenario: Verificar la redirección de la pagina al intentar hacer un pago
    Cuando busco un "control de pc" y lo compro
    Entonces se muestra la pagina de <iniciarSesion>


