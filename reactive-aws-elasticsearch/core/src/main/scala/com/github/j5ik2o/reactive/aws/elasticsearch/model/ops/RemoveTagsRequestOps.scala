// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class RemoveTagsRequestBuilderOps(val self: RemoveTagsRequest.Builder) extends AnyVal {

  final def withArnAsScala(value: Option[String]): RemoveTagsRequest.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def withTagKeysAsScala(value: Option[Seq[String]]): RemoveTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagKeys(v.asJava)
    } // Seq[String]
  }

}

final class RemoveTagsRequestOps(val self: RemoveTagsRequest) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def tagKeysAsScala: Option[Seq[String]] = Option(self.tagKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoveTagsRequestOps {

  implicit def toRemoveTagsRequestBuilderOps(v: RemoveTagsRequest.Builder): RemoveTagsRequestBuilderOps =
    new RemoveTagsRequestBuilderOps(v)

  implicit def toRemoveTagsRequestOps(v: RemoveTagsRequest): RemoveTagsRequestOps = new RemoveTagsRequestOps(v)

}
