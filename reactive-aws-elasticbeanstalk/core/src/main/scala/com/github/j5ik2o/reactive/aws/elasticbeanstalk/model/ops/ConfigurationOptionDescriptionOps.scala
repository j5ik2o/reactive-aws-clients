// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationOptionDescriptionBuilderOps(val self: ConfigurationOptionDescription.Builder) extends AnyVal {

  final def namespaceAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def defaultValueAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  } // String

  final def changeSeverityAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.changeSeverity(v)
    }
  } // String

  final def userDefinedAsScala(value: Option[Boolean]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.userDefined(v)
    }
  } // Boolean

  final def valueTypeAsScala(value: Option[ConfigurationOptionValueType]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.valueType(v)
    }
  } // String

  final def valueOptionsAsScala(value: Option[Seq[String]]): ConfigurationOptionDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.valueOptions(v.asJava)
    } // Seq[String]
  }

  final def minValueAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.minValue(v)
    }
  } // Int

  final def maxValueAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.maxValue(v)
    }
  } // Int

  final def maxLengthAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.maxLength(v)
    }
  } // Int

  final def regexAsScala(value: Option[OptionRestrictionRegex]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.regex(v)
    }
  } // OptionRestrictionRegex

}

final class ConfigurationOptionDescriptionOps(val self: ConfigurationOptionDescription) extends AnyVal {

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def defaultValueAsScala: Option[String] = Option(self.defaultValue) // String

  final def changeSeverityAsScala: Option[String] = Option(self.changeSeverity) // String

  final def userDefinedAsScala: Option[Boolean] = Option(self.userDefined) // Boolean

  final def valueTypeAsScala: Option[ConfigurationOptionValueType] = Option(self.valueType) // String

  final def valueOptionsAsScala: Option[Seq[String]] = Option(self.valueOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def minValueAsScala: Option[Int] = Option(self.minValue) // Int

  final def maxValueAsScala: Option[Int] = Option(self.maxValue) // Int

  final def maxLengthAsScala: Option[Int] = Option(self.maxLength) // Int

  final def regexAsScala: Option[OptionRestrictionRegex] = Option(self.regex) // OptionRestrictionRegex

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfigurationOptionDescriptionOps {

  implicit def toConfigurationOptionDescriptionBuilderOps(
      v: ConfigurationOptionDescription.Builder
  ): ConfigurationOptionDescriptionBuilderOps = new ConfigurationOptionDescriptionBuilderOps(v)

  implicit def toConfigurationOptionDescriptionOps(
      v: ConfigurationOptionDescription
  ): ConfigurationOptionDescriptionOps = new ConfigurationOptionDescriptionOps(v)

}
