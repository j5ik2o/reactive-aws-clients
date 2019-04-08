// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateResolverRequestBuilderOps(val self: CreateResolverRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def typeNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  } // String

  final def fieldNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  } // String

  final def dataSourceNameAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  } // String

  final def requestMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  } // String

  final def responseMappingTemplateAsScala(value: Option[String]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  } // String

  final def kindAsScala(value: Option[ResolverKind]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  } // String

  final def pipelineConfigAsScala(value: Option[PipelineConfig]): CreateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  } // PipelineConfig

}

final class CreateResolverRequestOps(val self: CreateResolverRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def typeNameAsScala: Option[String] = Option(self.typeName) // String

  final def fieldNameAsScala: Option[String] = Option(self.fieldName) // String

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName) // String

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate) // String

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate) // String

  final def kindAsScala: Option[ResolverKind] = Option(self.kind) // String

  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig) // PipelineConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateResolverRequestOps {

  implicit def toCreateResolverRequestBuilderOps(v: CreateResolverRequest.Builder): CreateResolverRequestBuilderOps =
    new CreateResolverRequestBuilderOps(v)

  implicit def toCreateResolverRequestOps(v: CreateResolverRequest): CreateResolverRequestOps =
    new CreateResolverRequestOps(v)

}
