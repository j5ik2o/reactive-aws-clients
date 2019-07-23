// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ConfigurationOptionDescriptionBuilderOps(val self: ConfigurationOptionDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.defaultValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSeverityAsScala(value: Option[String]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.changeSeverity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDefinedAsScala(value: Option[Boolean]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.userDefined(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueTypeAsScala(value: Option[ConfigurationOptionValueType]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.valueType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueOptionsAsScala(value: Option[Seq[String]]): ConfigurationOptionDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.valueOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minValueAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.minValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxValueAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.maxValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxLengthAsScala(value: Option[Int]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.maxLength(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regexAsScala(value: Option[OptionRestrictionRegex]): ConfigurationOptionDescription.Builder = {
    value.fold(self) { v =>
      self.regex(v)
    }
  }

}

final class ConfigurationOptionDescriptionOps(val self: ConfigurationOptionDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultValueAsScala: Option[String] = Option(self.defaultValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSeverityAsScala: Option[String] = Option(self.changeSeverity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDefinedAsScala: Option[Boolean] = Option(self.userDefined)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueTypeAsScala: Option[ConfigurationOptionValueType] = Option(self.valueType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueOptionsAsScala: Option[Seq[String]] = Option(self.valueOptions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minValueAsScala: Option[Int] = Option(self.minValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxValueAsScala: Option[Int] = Option(self.maxValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxLengthAsScala: Option[Int] = Option(self.maxLength)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regexAsScala: Option[OptionRestrictionRegex] = Option(self.regex)

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
