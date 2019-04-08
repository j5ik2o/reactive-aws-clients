// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTagsRequestBuilderOps(val self: CreateTagsRequest.Builder) extends AnyVal {

  final def resourcesAsScala(value: Option[Seq[String]]): CreateTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resources(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CreateTagsRequestOps(val self: CreateTagsRequest) extends AnyVal {

  final def resourcesAsScala: Option[Seq[String]] = Option(self.resources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTagsRequestOps {

  implicit def toCreateTagsRequestBuilderOps(v: CreateTagsRequest.Builder): CreateTagsRequestBuilderOps =
    new CreateTagsRequestBuilderOps(v)

  implicit def toCreateTagsRequestOps(v: CreateTagsRequest): CreateTagsRequestOps = new CreateTagsRequestOps(v)

}
