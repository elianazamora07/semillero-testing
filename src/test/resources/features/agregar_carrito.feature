# language: es
Característica: agregar al carrito
  Yo como comprador
  Quiero agregar elementos a un carrito de compra
  Para posteriormente comprar

  Escenario: agregar un control de PC al carrito de compras
    Cuando agrego un "control de pc" al carrito
    Entonces debe verse 1 item en el carrito de compras


  Escenario: agregar 3 items al carrito de compras
    Cuando Carlos agrega al carrito los items
      | "control de pc"  |
      | "mouse gaming"   |
      | "teclado gaming" |
    Entonces debe verse 3 items en el carrito de compras


  Escenario: Verificar la redirección de la pagina al intentar hacer un pago
    Dado que Carlos ha agregado un producto al carrito de compras
    Cuando Carlos procede al proceso de pago
    Entonces se muestra la pagina de iniciar sesión


