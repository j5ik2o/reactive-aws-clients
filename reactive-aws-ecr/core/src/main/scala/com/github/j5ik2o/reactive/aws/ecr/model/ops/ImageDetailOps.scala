// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageDetailBuilderOps(val self: ImageDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): ImageDetail.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): ImageDetail.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala(value: Option[String]): ImageDetail.Builder = {
    value.fold(self) { v =>
      self.imageDigest(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagsAsScala(value: Option[Seq[String]]): ImageDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.imageTags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageSizeInBytesAsScala(value: Option[Long]): ImageDetail.Builder = {
    value.fold(self) { v =>
      self.imageSizeInBytes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imagePushedAtAsScala(value: Option[java.time.Instant]): ImageDetail.Builder = {
    value.fold(self) { v =>
      self.imagePushedAt(v)
    }
  }

}

final class ImageDetailOps(val self: ImageDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageDigestAsScala: Option[String] = Option(self.imageDigest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageTagsAsScala: Option[Seq[String]] = Option(self.imageTags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageSizeInBytesAsScala: Option[Long] = Option(self.imageSizeInBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imagePushedAtAsScala: Option[java.time.Instant] = Option(self.imagePushedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageDetailOps {

  implicit def toImageDetailBuilderOps(v: ImageDetail.Builder): ImageDetailBuilderOps = new ImageDetailBuilderOps(v)

  implicit def toImageDetailOps(v: ImageDetail): ImageDetailOps = new ImageDetailOps(v)

}
