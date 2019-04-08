// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTagsRequestBuilderOps(val self: DeleteTagsRequest.Builder) extends AnyVal {

  final def resourcesAsScala(value: Option[Seq[String]]): DeleteTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resources(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): DeleteTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class DeleteTagsRequestOps(val self: DeleteTagsRequest) extends AnyVal {

  final def resourcesAsScala: Option[Seq[String]] = Option(self.resources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTagsRequestOps {

  implicit def toDeleteTagsRequestBuilderOps(v: DeleteTagsRequest.Builder): DeleteTagsRequestBuilderOps =
    new DeleteTagsRequestBuilderOps(v)

  implicit def toDeleteTagsRequestOps(v: DeleteTagsRequest): DeleteTagsRequestOps = new DeleteTagsRequestOps(v)

}
