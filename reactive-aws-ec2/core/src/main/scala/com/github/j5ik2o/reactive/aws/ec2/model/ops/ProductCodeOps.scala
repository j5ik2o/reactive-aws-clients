// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProductCodeBuilderOps(val self: ProductCode.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodeIdAsScala(value: Option[String]): ProductCode.Builder = {
            value.fold(self){ v => self.productCodeId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodeTypeAsScala(value: Option[ProductCodeValues]): ProductCode.Builder = {
            value.fold(self){ v => self.productCodeType(v) }
            } 


}

final class ProductCodeOps(val self: ProductCode) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodeIdAsScala: Option[String] = Option(self.productCodeId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodeTypeAsScala: Option[ProductCodeValues] = Option(self.productCodeType) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProductCodeOps {

implicit def toProductCodeBuilderOps(v: ProductCode.Builder): ProductCodeBuilderOps = new ProductCodeBuilderOps(v)

implicit def toProductCodeOps(v: ProductCode): ProductCodeOps = new ProductCodeOps(v)

}

