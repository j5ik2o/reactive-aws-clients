// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpdateElasticsearchDomainConfigRequestBuilderOps(val self: UpdateElasticsearchDomainConfigRequest.Builder)
    extends AnyVal {

  final def domainNameAsScala(value: Option[String]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  final def ebsOptionsAsScala(value: Option[EBSOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  final def vpcOptionsAsScala(value: Option[VPCOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  final def advancedOptionsAsScala(
      value: Option[Map[String, String]]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.advancedOptions(v.asJava)
    }
  }

  final def accessPoliciesAsScala(value: Option[String]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logPublishingOptions(v.asJava)
    }
  }

}

final class UpdateElasticsearchDomainConfigRequestOps(val self: UpdateElasticsearchDomainConfigRequest) extends AnyVal {

  final def domainNameAsScala: Option[String] = Option(self.domainName)

  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig)

  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions)

  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions)

  final def vpcOptionsAsScala: Option[VPCOptions] = Option(self.vpcOptions)

  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions)

  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies)

  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateElasticsearchDomainConfigRequestOps {

  implicit def toUpdateElasticsearchDomainConfigRequestBuilderOps(
      v: UpdateElasticsearchDomainConfigRequest.Builder
  ): UpdateElasticsearchDomainConfigRequestBuilderOps = new UpdateElasticsearchDomainConfigRequestBuilderOps(v)

  implicit def toUpdateElasticsearchDomainConfigRequestOps(
      v: UpdateElasticsearchDomainConfigRequest
  ): UpdateElasticsearchDomainConfigRequestOps = new UpdateElasticsearchDomainConfigRequestOps(v)

}
