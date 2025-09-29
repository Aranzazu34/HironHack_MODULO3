// primero se importa el archivo que contiene la función, sin poner la extensión .js :
const repetir = require("./repetir");

describe("PROBANDO LA FUNCIÓN REPETIR", () => {
  // luego se hacen los tests
  test("repite 3 veces 'hola'", () => {
    expect(repetir("hola", 3)).toBe("holaholahola");
  });

  test("repite 2 veces 'adiós'", () => {
    expect(repetir("adiós", 2)).toBe("adiósadiós");
  });

  // si se quiere probar que falle, se puede hacer así:
  test("repite 2 veces 'adiós' (test que falla a propósito)", () => {
    expect(repetir("adiós", 2)).toBe("adiósadiósadiós");
  });

  test("repite 0 veces 'adiós'", () => {
    expect(repetir("adiós", 0)).toBe("");
  });

  test("repite -1 veces 'adiós'", () => {
    expect(repetir("adiós", -1)).toBe("");
  });

  test("repite 2 veces 'hola' (test falla al poner adios", () => {
    expect(repetir("hola", 2)).toBe("adiósadiós");
  });
});
