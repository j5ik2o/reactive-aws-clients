// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAttributesRequestBuilderOps(val self: PutAttributesRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): PutAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def attributesAsScala(value: Option[Seq[Attribute]]): PutAttributesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

}

final class PutAttributesRequestOps(val self: PutAttributesRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAttributesRequestOps {

  implicit def toPutAttributesRequestBuilderOps(v: PutAttributesRequest.Builder): PutAttributesRequestBuilderOps =
    new PutAttributesRequestBuilderOps(v)

  implicit def toPutAttributesRequestOps(v: PutAttributesRequest): PutAttributesRequestOps =
    new PutAttributesRequestOps(v)

}
