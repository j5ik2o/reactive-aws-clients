// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateResolverRequestBuilderOps(val self: CreateResolverRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def typeNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  final def fieldNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

  final def dataSourceNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  final def requestMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  final def responseMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  final def kindAsScala(value: Option[ResolverKind]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  }

  final def pipelineConfigAsScala(value: Option[PipelineConfig]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  }

}

final class CreateResolverRequestOps(val self: CreateResolverRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def typeNameAsScala: Option[String] = Option(self.typeName)

  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  final def kindAsScala: Option[ResolverKind] = Option(self.kind)

  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateResolverRequestOps {

  implicit def toCreateResolverRequestBuilderOps(v: CreateResolverRequest.Builder): CreateResolverRequestBuilderOps =
    new CreateResolverRequestBuilderOps(v)

  implicit def toCreateResolverRequestOps(v: CreateResolverRequest): CreateResolverRequestOps =
    new CreateResolverRequestOps(v)

}
