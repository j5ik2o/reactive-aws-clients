// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ChangeMessageVisibilityBatchResponseBuilderOps(val self: ChangeMessageVisibilityBatchResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala(
      value: Option[Seq[ChangeMessageVisibilityBatchResultEntry]]
  ): ChangeMessageVisibilityBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala(value: Option[Seq[BatchResultErrorEntry]]): ChangeMessageVisibilityBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failed(v.asJava)
    }
  }

}

final class ChangeMessageVisibilityBatchResponseOps(val self: ChangeMessageVisibilityBatchResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala: Option[Seq[ChangeMessageVisibilityBatchResultEntry]] = Option(self.successful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala: Option[Seq[BatchResultErrorEntry]] = Option(self.failed).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToChangeMessageVisibilityBatchResponseOps {

  implicit def toChangeMessageVisibilityBatchResponseBuilderOps(
      v: ChangeMessageVisibilityBatchResponse.Builder
  ): ChangeMessageVisibilityBatchResponseBuilderOps = new ChangeMessageVisibilityBatchResponseBuilderOps(v)

  implicit def toChangeMessageVisibilityBatchResponseOps(
      v: ChangeMessageVisibilityBatchResponse
  ): ChangeMessageVisibilityBatchResponseOps = new ChangeMessageVisibilityBatchResponseOps(v)

}
