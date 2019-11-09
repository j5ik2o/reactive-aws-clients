// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class CreateQueueRequestBuilderOps(val self: CreateQueueRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNameAsScala(value: Option[String]): CreateQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Map[QueueAttributeName, String]]): CreateQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): CreateQueueRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateQueueRequestOps(val self: CreateQueueRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueNameAsScala: Option[String] = Option(self.queueName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Map[QueueAttributeName, String]] = Option(self.attributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateQueueRequestOps {

  implicit def toCreateQueueRequestBuilderOps(v: CreateQueueRequest.Builder): CreateQueueRequestBuilderOps =
    new CreateQueueRequestBuilderOps(v)

  implicit def toCreateQueueRequestOps(v: CreateQueueRequest): CreateQueueRequestOps = new CreateQueueRequestOps(v)

}
