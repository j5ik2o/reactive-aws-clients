// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchGetImageResponseBuilderOps(val self: BatchGetImageResponse.Builder) extends AnyVal {

  final def imagesAsScala(value: Option[Seq[Image]]): BatchGetImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.images(v.asJava)
    }
  }

  final def failuresAsScala(value: Option[Seq[ImageFailure]]): BatchGetImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failures(v.asJava)
    }
  }

}

final class BatchGetImageResponseOps(val self: BatchGetImageResponse) extends AnyVal {

  final def imagesAsScala: Option[Seq[Image]] = Option(self.images).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def failuresAsScala: Option[Seq[ImageFailure]] = Option(self.failures).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetImageResponseOps {

  implicit def toBatchGetImageResponseBuilderOps(v: BatchGetImageResponse.Builder): BatchGetImageResponseBuilderOps =
    new BatchGetImageResponseBuilderOps(v)

  implicit def toBatchGetImageResponseOps(v: BatchGetImageResponse): BatchGetImageResponseOps =
    new BatchGetImageResponseOps(v)

}
