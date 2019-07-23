// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchDeleteImageResponseBuilderOps(val self: BatchDeleteImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdsAsScala(value: Option[Seq[ImageIdentifier]]): BatchDeleteImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.imageIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[ImageFailure]]): BatchDeleteImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class BatchDeleteImageResponseOps(val self: BatchDeleteImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdsAsScala: Option[Seq[ImageIdentifier]] = Option(self.imageIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[ImageFailure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchDeleteImageResponseOps {

  implicit def toBatchDeleteImageResponseBuilderOps(
      v: BatchDeleteImageResponse.Builder
  ): BatchDeleteImageResponseBuilderOps = new BatchDeleteImageResponseBuilderOps(v)

  implicit def toBatchDeleteImageResponseOps(v: BatchDeleteImageResponse): BatchDeleteImageResponseOps =
    new BatchDeleteImageResponseOps(v)

}
