// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompletedMultipartUploadBuilderOps(val self: CompletedMultipartUpload.Builder) extends AnyVal {

  final def withPartsAsScala(value: Option[Seq[CompletedPart]]): CompletedMultipartUpload.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parts(v.asJava)
    } // Seq[CompletedPart]
  }

}

final class CompletedMultipartUploadOps(val self: CompletedMultipartUpload) extends AnyVal {

  final def partsAsScala: Option[Seq[CompletedPart]] = Option(self.parts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[CompletedPart]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompletedMultipartUploadOps {

  implicit def toCompletedMultipartUploadBuilderOps(
      v: CompletedMultipartUpload.Builder
  ): CompletedMultipartUploadBuilderOps = new CompletedMultipartUploadBuilderOps(v)

  implicit def toCompletedMultipartUploadOps(v: CompletedMultipartUpload): CompletedMultipartUploadOps =
    new CompletedMultipartUploadOps(v)

}
