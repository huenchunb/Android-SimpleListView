**Android Simple ListView**

Una simple aplicación que permite mostrar datos estáticos (ArrayList<String>)
en un widget de tipo ListView.

Para esto utilizaremos 3 widgets implementados por Android:

<ul>
<li>Toast</li>
<li>ListView</li>
<li>ArrayAdapter</li>
</ul>

*Por medio de estos tres widgets podremos mostrar los datos en la vista*

***Layout***

Utilizaremos un layout simple_list_item_1, el cual, está implementado en Android,
como layout por defecto. Cabe destacar que se pueden crear layouts personalizados para
así mejorar la interfaz y la experiencia de usuario. Por motivos de aprendizaje,
utilizaremos widgets y layouts que ya vienen implementados en Android.

En en layout activity_main.xml debemos implementar el ListView que será
el encargado de mostrar la información del ArrayList<String>. Esté widget
tendrá un id para capturar el widget a nivel de clase y realizar la lógica
que permite cargar la información.

***Clases***

En la clase MainActivity.java se encuentra toda la lógica de aplicación
que pueden revisar para ver como mostrar datos o una lista de datos en
una aplicación Android de manera simple y fácil.

Esto es un ejemplo pero, en proyectos profesionales la carga de datos pueden ser
objetos, clases, listas o diferentes estructuras de datos dependiendo de cada
desarrollo.

