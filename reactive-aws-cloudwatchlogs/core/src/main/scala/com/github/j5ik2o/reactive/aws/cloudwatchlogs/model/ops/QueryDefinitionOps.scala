// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryDefinitionBuilderOps(val self: QueryDefinition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala(value: Option[String]): QueryDefinition.Builder = {
    value.fold(self) { v => self.queryDefinitionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): QueryDefinition.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala(value: Option[String]): QueryDefinition.Builder = {
    value.fold(self) { v => self.queryString(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[Long]): QueryDefinition.Builder = {
    value.fold(self) { v => self.lastModified(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala(value: Option[Seq[String]]): QueryDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logGroupNames(v.asJava)
    }
  }

}

final class QueryDefinitionOps(val self: QueryDefinition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala: Option[String] = Option(self.queryDefinitionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala: Option[String] = Option(self.queryString)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[Long] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala: Option[Seq[String]] =
    Option(self.logGroupNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryDefinitionOps {

  implicit def toQueryDefinitionBuilderOps(v: QueryDefinition.Builder): QueryDefinitionBuilderOps =
    new QueryDefinitionBuilderOps(v)

  implicit def toQueryDefinitionOps(v: QueryDefinition): QueryDefinitionOps = new QueryDefinitionOps(v)

}
