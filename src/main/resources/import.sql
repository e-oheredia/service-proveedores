USE [db_service_proveedores]

SET IDENTITY_INSERT [dbo].[tipo_proveedor] ON 
INSERT [dbo].[tipo_proveedor] ([tipo_proveedor_id], [descripcion]) VALUES (1, 'Mensajeria')
INSERT [dbo].[tipo_proveedor] ([tipo_proveedor_id], [descripcion]) VALUES (2, 'Impresion')
SET IDENTITY_INSERT [dbo].[tipo_proveedor] OFF


SET IDENTITY_INSERT [dbo].[proveedor] ON 
INSERT [dbo].[proveedor] ([proveedor_id], [nombre],[tipo_proveedor_id]) VALUES (1, 'DOCFLOW',1)
INSERT [dbo].[proveedor] ([proveedor_id], [nombre],[tipo_proveedor_id]) VALUES (2, 'URBANO',2)
SET IDENTITY_INSERT [dbo].[proveedor] OFF 

 
