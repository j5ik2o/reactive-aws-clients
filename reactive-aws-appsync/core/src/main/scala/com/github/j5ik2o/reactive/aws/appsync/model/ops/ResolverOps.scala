// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ResolverBuilderOps(val self: Resolver.Builder) extends AnyVal {

  final def withTypeNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  } // String

  final def withFieldNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  } // String

  final def withDataSourceNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  } // String

  final def withResolverArnAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.resolverArn(v)
    }
  } // String

  final def withRequestMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  } // String

  final def withResponseMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  } // String

  final def withKindAsScala(value: Option[ResolverKind]): Resolver.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  } // String

  final def withPipelineConfigAsScala(value: Option[PipelineConfig]): Resolver.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  } // PipelineConfig

}

final class ResolverOps(val self: Resolver) extends AnyVal {

  final def typeNameAsScala: Option[String] = Option(self.typeName) // String

  final def fieldNameAsScala: Option[String] = Option(self.fieldName) // String

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName) // String

  final def resolverArnAsScala: Option[String] = Option(self.resolverArn) // String

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate) // String

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate) // String

  final def kindAsScala: Option[ResolverKind] = Option(self.kind) // String

  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig) // PipelineConfig

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResolverOps {

  implicit def toResolverBuilderOps(v: Resolver.Builder): ResolverBuilderOps = new ResolverBuilderOps(v)

  implicit def toResolverOps(v: Resolver): ResolverOps = new ResolverOps(v)

}
