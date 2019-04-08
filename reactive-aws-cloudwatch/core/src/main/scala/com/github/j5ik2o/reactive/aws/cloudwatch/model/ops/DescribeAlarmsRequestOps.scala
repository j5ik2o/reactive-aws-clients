// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsRequestBuilderOps(val self: DescribeAlarmsRequest.Builder) extends AnyVal {

  final def alarmNamesAsScala(value: Option[Seq[String]]): DescribeAlarmsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.alarmNames(v.asJava)
    } // Seq[String]
  }

  final def alarmNamePrefixAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.alarmNamePrefix(v)
    }
  } // String

  final def stateValueAsScala(value: Option[StateValue]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  } // StateValue

  final def actionPrefixAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.actionPrefix(v)
    }
  } // String

  final def maxRecordsAsScala(value: Option[Int]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  } // Int

  final def nextTokenAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeAlarmsRequestOps(val self: DescribeAlarmsRequest) extends AnyVal {

  final def alarmNamesAsScala: Option[Seq[String]] = Option(self.alarmNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def alarmNamePrefixAsScala: Option[String] = Option(self.alarmNamePrefix) // String

  final def stateValueAsScala: Option[StateValue] = Option(self.stateValue) // StateValue

  final def actionPrefixAsScala: Option[String] = Option(self.actionPrefix) // String

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsRequestOps {

  implicit def toDescribeAlarmsRequestBuilderOps(v: DescribeAlarmsRequest.Builder): DescribeAlarmsRequestBuilderOps =
    new DescribeAlarmsRequestBuilderOps(v)

  implicit def toDescribeAlarmsRequestOps(v: DescribeAlarmsRequest): DescribeAlarmsRequestOps =
    new DescribeAlarmsRequestOps(v)

}
