// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class CreateLogGroupRequestBuilderOps(val self: CreateLogGroupRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): CreateLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def kmsKeyIdAsScala(value: Option[String]): CreateLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  } // String

  final def tagsAsScala(value: Option[Map[String, String]]): CreateLogGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

}

final class CreateLogGroupRequestOps(val self: CreateLogGroupRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId) // String

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLogGroupRequestOps {

  implicit def toCreateLogGroupRequestBuilderOps(v: CreateLogGroupRequest.Builder): CreateLogGroupRequestBuilderOps =
    new CreateLogGroupRequestBuilderOps(v)

  implicit def toCreateLogGroupRequestOps(v: CreateLogGroupRequest): CreateLogGroupRequestOps =
    new CreateLogGroupRequestOps(v)

}
