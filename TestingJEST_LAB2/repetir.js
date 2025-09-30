function repetir(texto, veces) {
  return texto.repeat(veces);
}

function average(a, b) {
  if (typeof a !== "number" || typeof b !== "number") {
    throw new Error("Los parámetros deben ser números");
  }
  //console.log("Los números son: " + a + " y " + b);
  //console.log("La media es: " + (a + b) / 2);
}

function average2(a, b) {
  return (a + b) / 2;
}

// la exportas al testing
module.exports = { repetir, average, average2 };
