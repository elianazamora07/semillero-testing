# language: es
Característica: filtrar items por rango de precio
  Yo como comprador
  Quiero ver  si está disponible el item

  Escenario: filtrar items por rango de precio
    Cuando busco "celulares" y aplico el filtro de rango por precio
    Entonces el filtro de <PrecioSeleccionado> debe estar seleccionado




