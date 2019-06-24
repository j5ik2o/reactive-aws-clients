// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageBatchResponseBuilderOps(val self: DeleteMessageBatchResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala(value: Option[Seq[DeleteMessageBatchResultEntry]]): DeleteMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successful(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala(value: Option[Seq[BatchResultErrorEntry]]): DeleteMessageBatchResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failed(v.asJava)
    }
  }

}

final class DeleteMessageBatchResponseOps(val self: DeleteMessageBatchResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def successfulAsScala: Option[Seq[DeleteMessageBatchResultEntry]] = Option(self.successful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failedAsScala: Option[Seq[BatchResultErrorEntry]] = Option(self.failed).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageBatchResponseOps {

  implicit def toDeleteMessageBatchResponseBuilderOps(
      v: DeleteMessageBatchResponse.Builder
  ): DeleteMessageBatchResponseBuilderOps = new DeleteMessageBatchResponseBuilderOps(v)

  implicit def toDeleteMessageBatchResponseOps(v: DeleteMessageBatchResponse): DeleteMessageBatchResponseOps =
    new DeleteMessageBatchResponseOps(v)

}
