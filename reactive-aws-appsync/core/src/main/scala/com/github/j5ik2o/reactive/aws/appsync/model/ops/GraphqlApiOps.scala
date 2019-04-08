// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GraphqlApiBuilderOps(val self: GraphqlApi.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def apiIdAsScala(value: Option[String]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def authenticationTypeAsScala(value: Option[AuthenticationType]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.authenticationType(v)
    }
  }

  final def logConfigAsScala(value: Option[LogConfig]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.logConfig(v)
    }
  }

  final def userPoolConfigAsScala(value: Option[UserPoolConfig]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.userPoolConfig(v)
    }
  }

  final def openIDConnectConfigAsScala(value: Option[OpenIDConnectConfig]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.openIDConnectConfig(v)
    }
  }

  final def arnAsScala(value: Option[String]): GraphqlApi.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def urisAsScala(value: Option[Map[String, String]]): GraphqlApi.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.uris(v.asJava)
    }
  }

}

final class GraphqlApiOps(val self: GraphqlApi) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def authenticationTypeAsScala: Option[AuthenticationType] = Option(self.authenticationType)

  final def logConfigAsScala: Option[LogConfig] = Option(self.logConfig)

  final def userPoolConfigAsScala: Option[UserPoolConfig] = Option(self.userPoolConfig)

  final def openIDConnectConfigAsScala: Option[OpenIDConnectConfig] = Option(self.openIDConnectConfig)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def urisAsScala: Option[Map[String, String]] = Option(self.uris).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGraphqlApiOps {

  implicit def toGraphqlApiBuilderOps(v: GraphqlApi.Builder): GraphqlApiBuilderOps = new GraphqlApiBuilderOps(v)

  implicit def toGraphqlApiOps(v: GraphqlApi): GraphqlApiOps = new GraphqlApiOps(v)

}
