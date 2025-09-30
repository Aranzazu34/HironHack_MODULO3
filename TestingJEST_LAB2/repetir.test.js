// primero se importa el archivo que contiene la función, sin poner la extensión .js :
const { repetir, average, average2 } = require("./repetir");

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

//console.log("La media es: " + (a + b) / 2);
describe("PROBANDO LA FUNCIÓN AVERAGE", () => {
  // para probar que una función lanza un error, se hace así:
  test("lanza error si alguno de los parámetros no es un número", () => {
    expect(average(3, "hola")).toThrow("Los parámetros deben ser números");
  });

  test("media de 1 y 1.44444444 es 1.22", () => {
    expect(average2(1, 1.44444444)).toBeCloseTo(1.22);
  });

  test("media de 5 y 3 es mayor que 3", () => {
    expect(average2(5, 3)).toBeGreaterThan(3);
  });

  test("media de 0 y 0 es falsy", () => {
    expect(average2(0, 0)).toBeFalsy();
  });

  test('media de "" y 0 es falsy', () => {
    expect(average("", 0)).toBeFalsy();
  });

  test("media de 2 y undefined es falsy", () => {
    expect(average2(2, undefined)).toBeFalsy();
  });

  test("la función sin return devuelve undefined", () => {
    expect(average2(2, 3)).toBeUndefined();
  });

  test("esto no da Null", () => {
    expect(average(2, 3)).not.toBeNull();
  });

  test("esto no da Null", () => {
    expect(average(2, 3)).not.toBeNull();
  });

  test("si uno no es número, será null?", () => {
    expect(average("a", 6)).toBeNull();
  });

  test("si uno no es número, será NaN", () => {
    expect(average("a", 6)).toBeNaN();
  });

  test("si uno no es número y otro undefined, será NaN", () => {
    expect(average(14, undefined)).toBeNaN();
  });
});

/*
probar matchers:

- toBeCloseTo()

- toBeGreaterThan()

- toBeFalsy()

- toBeUndefined()

- toBeNull()

- toBeNaN()
*/
