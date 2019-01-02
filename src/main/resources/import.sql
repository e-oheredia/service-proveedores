
SET IDENTITY_INSERT [dbo].[tipo_proveedor] ON 
INSERT [dbo].[tipo_proveedor] ([tipo_proveedor_id], [descripcion]) VALUES (1, 'Mensajeria')
INSERT [dbo].[tipo_proveedor] ([tipo_proveedor_id], [descripcion]) VALUES (2, 'Impresion')
SET IDENTITY_INSERT [dbo].[tipo_proveedor] OFF


SET IDENTITY_INSERT [dbo].[proveedor] ON 
INSERT [dbo].[proveedor] ([proveedor_id], [nombre],[tipo_proveedor_id]) VALUES (1, 'DOCFLOW',1)
INSERT [dbo].[proveedor] ([proveedor_id], [nombre],[tipo_proveedor_id]) VALUES (2, 'URBANO',1)
SET IDENTITY_INSERT [dbo].[proveedor] OFF 

SET IDENTITY_INSERT [dbo].[empleado] ON 
INSERT [dbo].[empleado] ([empleado_id], [nombres], [matricula], [proveedor_id]) VALUES (1, 'ROBERTO DAVILA', 'RDAVILA',1)
SET IDENTITY_INSERT [dbo].[empleado] OFF 

 
