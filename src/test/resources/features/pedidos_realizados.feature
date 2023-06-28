# language: es
Característica: Pedidos realizados

  @manual
  @manual-result:passed
  Escenario: Verificar mis últimos pedidos
    Dado que ya he realizado compras en amazon
    Cuando ingreso a pedidos
    Entonces puedo ver la lista de pedidos en orden cronológico

  @manual
  @manual-result:passed
  Escenario: Ver detalles de un pedido específico
    Cuando ingreso a la página de pedidos
    Y selecciono un pedido específico de la lista
    Entonces puedo ver los detalles completos de ese pedido