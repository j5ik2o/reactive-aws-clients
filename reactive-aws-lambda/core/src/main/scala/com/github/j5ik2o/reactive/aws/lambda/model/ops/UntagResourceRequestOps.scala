// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UntagResourceRequestBuilderOps(val self: UntagResourceRequest.Builder) extends AnyVal {

  final def resourceAsScala(value: Option[String]): UntagResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  } // String

  final def tagKeysAsScala(value: Option[Seq[String]]): UntagResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagKeys(v.asJava)
    } // Seq[String]
  }

}

final class UntagResourceRequestOps(val self: UntagResourceRequest) extends AnyVal {

  final def resourceAsScala: Option[String] = Option(self.resource) // String

  final def tagKeysAsScala: Option[Seq[String]] = Option(self.tagKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagResourceRequestOps {

  implicit def toUntagResourceRequestBuilderOps(v: UntagResourceRequest.Builder): UntagResourceRequestBuilderOps =
    new UntagResourceRequestBuilderOps(v)

  implicit def toUntagResourceRequestOps(v: UntagResourceRequest): UntagResourceRequestOps =
    new UntagResourceRequestOps(v)

}
