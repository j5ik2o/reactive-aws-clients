// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AddTagsRequestBuilderOps(val self: AddTagsRequest.Builder) extends AnyVal {

  final def arnAsScala(value: Option[String]): AddTagsRequest.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def tagListAsScala(value: Option[Seq[Tag]]): AddTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagList(v.asJava)
    }
  }

}

final class AddTagsRequestOps(val self: AddTagsRequest) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn)

  final def tagListAsScala: Option[Seq[Tag]] = Option(self.tagList).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddTagsRequestOps {

  implicit def toAddTagsRequestBuilderOps(v: AddTagsRequest.Builder): AddTagsRequestBuilderOps =
    new AddTagsRequestBuilderOps(v)

  implicit def toAddTagsRequestOps(v: AddTagsRequest): AddTagsRequestOps = new AddTagsRequestOps(v)

}
