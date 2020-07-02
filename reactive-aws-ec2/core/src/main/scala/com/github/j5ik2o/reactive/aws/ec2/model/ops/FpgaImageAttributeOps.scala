// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaImageAttributeBuilderOps(val self: FpgaImageAttribute.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala(value: Option[String]): FpgaImageAttribute.Builder = {
    value.fold(self) { v => self.fpgaImageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): FpgaImageAttribute.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): FpgaImageAttribute.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadPermissionsAsScala(value: Option[Seq[LoadPermission]]): FpgaImageAttribute.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadPermissions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): FpgaImageAttribute.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

}

final class FpgaImageAttributeOps(val self: FpgaImageAttribute) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadPermissionsAsScala: Option[Seq[LoadPermission]] =
    Option(self.loadPermissions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] =
    Option(self.productCodes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaImageAttributeOps {

  implicit def toFpgaImageAttributeBuilderOps(v: FpgaImageAttribute.Builder): FpgaImageAttributeBuilderOps =
    new FpgaImageAttributeBuilderOps(v)

  implicit def toFpgaImageAttributeOps(v: FpgaImageAttribute): FpgaImageAttributeOps = new FpgaImageAttributeOps(v)

}
