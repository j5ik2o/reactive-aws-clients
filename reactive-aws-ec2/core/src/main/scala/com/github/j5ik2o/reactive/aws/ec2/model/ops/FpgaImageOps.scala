// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaImageBuilderOps(val self: FpgaImage.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.fpgaImageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageGlobalIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.fpgaImageGlobalId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shellVersionAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.shellVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pciIdAsScala(value: Option[PciId]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.pciId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[FpgaImageState]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateTimeAsScala(value: Option[java.time.Instant]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.updateTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.ownerAlias(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala(value: Option[Seq[ProductCode]]): FpgaImage.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): FpgaImage.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isPublicAsScala(value: Option[Boolean]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.isPublic(v)
    }
  }

}

final class FpgaImageOps(val self: FpgaImage) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageGlobalIdAsScala: Option[String] = Option(self.fpgaImageGlobalId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shellVersionAsScala: Option[String] = Option(self.shellVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pciIdAsScala: Option[PciId] = Option(self.pciId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[FpgaImageState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateTimeAsScala: Option[java.time.Instant] = Option(self.updateTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAliasAsScala: Option[String] = Option(self.ownerAlias)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isPublicAsScala: Option[Boolean] = Option(self.isPublic)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaImageOps {

  implicit def toFpgaImageBuilderOps(v: FpgaImage.Builder): FpgaImageBuilderOps = new FpgaImageBuilderOps(v)

  implicit def toFpgaImageOps(v: FpgaImage): FpgaImageOps = new FpgaImageOps(v)

}
