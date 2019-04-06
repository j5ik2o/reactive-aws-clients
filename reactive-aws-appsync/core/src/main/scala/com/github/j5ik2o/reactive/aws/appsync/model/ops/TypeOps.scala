// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class TypeBuilderOps(val self: Type.Builder) extends AnyVal {

  final def withNameAsScala(value: Option[String]): Type.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): Type.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withArnAsScala(value: Option[String]): Type.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def withDefinitionAsScala(value: Option[String]): Type.Builder = {
    value.fold(self) { v =>
      self.definition(v)
    }
  } // String

  final def withFormatAsScala(value: Option[TypeDefinitionFormat]): Type.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  } // String

}

final class TypeOps(val self: Type) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def definitionAsScala: Option[String] = Option(self.definition) // String

  final def formatAsScala: Option[TypeDefinitionFormat] = Option(self.format) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTypeOps {

  implicit def toTypeBuilderOps(v: Type.Builder): TypeBuilderOps = new TypeBuilderOps(v)

  implicit def toTypeOps(v: Type): TypeOps = new TypeOps(v)

}
