// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchGetImageResponseBuilderOps(val self: BatchGetImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imagesAsScala(value: Option[Seq[Image]]): BatchGetImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.images(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[ImageFailure]]): BatchGetImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class BatchGetImageResponseOps(val self: BatchGetImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imagesAsScala: Option[Seq[Image]] =
    Option(self.images).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[ImageFailure]] =
    Option(self.failures).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetImageResponseOps {

  implicit def toBatchGetImageResponseBuilderOps(v: BatchGetImageResponse.Builder): BatchGetImageResponseBuilderOps =
    new BatchGetImageResponseBuilderOps(v)

  implicit def toBatchGetImageResponseOps(v: BatchGetImageResponse): BatchGetImageResponseOps =
    new BatchGetImageResponseOps(v)

}
