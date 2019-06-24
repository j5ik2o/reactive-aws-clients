// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateResolverRequestBuilderOps(val self: CreateResolverRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kindAsScala(value: Option[ResolverKind]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pipelineConfigAsScala(value: Option[PipelineConfig]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  }

}

final class CreateResolverRequestOps(val self: CreateResolverRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kindAsScala: Option[ResolverKind] = Option(self.kind)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateResolverRequestOps {

  implicit def toCreateResolverRequestBuilderOps(v: CreateResolverRequest.Builder): CreateResolverRequestBuilderOps =
    new CreateResolverRequestBuilderOps(v)

  implicit def toCreateResolverRequestOps(v: CreateResolverRequest): CreateResolverRequestOps =
    new CreateResolverRequestOps(v)

}
