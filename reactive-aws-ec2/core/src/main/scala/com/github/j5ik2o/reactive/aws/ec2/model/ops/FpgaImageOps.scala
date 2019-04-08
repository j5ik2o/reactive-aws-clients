// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaImageBuilderOps(val self: FpgaImage.Builder) extends AnyVal {

  final def fpgaImageIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.fpgaImageId(v)
    }
  }

  final def fpgaImageGlobalIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.fpgaImageGlobalId(v)
    }
  }

  final def nameAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def shellVersionAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.shellVersion(v)
    }
  }

  final def pciIdAsScala(value: Option[PciId]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.pciId(v)
    }
  }

  final def stateAsScala(value: Option[FpgaImageState]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def createTimeAsScala(value: Option[java.time.Instant]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def updateTimeAsScala(value: Option[java.time.Instant]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.updateTime(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def ownerAliasAsScala(value: Option[String]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.ownerAlias(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): FpgaImage.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): FpgaImage.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def isPublicAsScala(value: Option[Boolean]): FpgaImage.Builder = {
    value.fold(self) { v =>
      self.isPublic(v)
    }
  }

}

final class FpgaImageOps(val self: FpgaImage) extends AnyVal {

  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  final def fpgaImageGlobalIdAsScala: Option[String] = Option(self.fpgaImageGlobalId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def shellVersionAsScala: Option[String] = Option(self.shellVersion)

  final def pciIdAsScala: Option[PciId] = Option(self.pciId)

  final def stateAsScala: Option[FpgaImageState] = Option(self.state)

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def updateTimeAsScala: Option[java.time.Instant] = Option(self.updateTime)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def ownerAliasAsScala: Option[String] = Option(self.ownerAlias)

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def isPublicAsScala: Option[Boolean] = Option(self.isPublic)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaImageOps {

  implicit def toFpgaImageBuilderOps(v: FpgaImage.Builder): FpgaImageBuilderOps = new FpgaImageBuilderOps(v)

  implicit def toFpgaImageOps(v: FpgaImage): FpgaImageOps = new FpgaImageOps(v)

}
