// Obtener la ruta del script actual
const rutaActual = new URL(import.meta.url).pathname;

// Obtener la carpeta del script actual
const carpetaActual = new URL('.', rutaActual).pathname;

console.log(`El script se encuentra en la carpeta: ${carpetaActual}`);



// En JavaScript, puedes utilizar el objeto import.meta para obtener información sobre el módulo actual, incluida la ruta del archivo.
// Este código utiliza la API de URL para manipular la ruta del módulo actual y extraer la carpeta.
// Ten en cuenta que el uso de import.meta es compatible con los módulos ECMAScript, y este código funcionará en entornos que admitan esta funcionalidad,
// como en navegadores modernos o en entornos Node.js con soporte para módulos ECMAScript.