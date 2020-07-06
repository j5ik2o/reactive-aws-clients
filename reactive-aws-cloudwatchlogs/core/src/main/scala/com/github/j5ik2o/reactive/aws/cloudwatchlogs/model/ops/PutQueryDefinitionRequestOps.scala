// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutQueryDefinitionRequestBuilderOps(val self: PutQueryDefinitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): PutQueryDefinitionRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala(value: Option[String]): PutQueryDefinitionRequest.Builder = {
    value.fold(self) { v => self.queryDefinitionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala(value: Option[Seq[String]]): PutQueryDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logGroupNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala(value: Option[String]): PutQueryDefinitionRequest.Builder = {
    value.fold(self) { v => self.queryString(v) }
  }

}

final class PutQueryDefinitionRequestOps(val self: PutQueryDefinitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionIdAsScala: Option[String] = Option(self.queryDefinitionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala: Option[Seq[String]] =
    Option(self.logGroupNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala: Option[String] = Option(self.queryString)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutQueryDefinitionRequestOps {

  implicit def toPutQueryDefinitionRequestBuilderOps(
      v: PutQueryDefinitionRequest.Builder
  ): PutQueryDefinitionRequestBuilderOps = new PutQueryDefinitionRequestBuilderOps(v)

  implicit def toPutQueryDefinitionRequestOps(v: PutQueryDefinitionRequest): PutQueryDefinitionRequestOps =
    new PutQueryDefinitionRequestOps(v)

}
