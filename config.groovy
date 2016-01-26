task buildnumberplusone « { 
 Properties props = new Properties()
 File propsFile = new File(‘gradle.properties’)
 props.load(propsFile.newDataInputStream())
 Integer nextbuildnum = ( ((props.getProperty('artifactBuildNumber')) as BigDecimal) + 1 )
 props.setProperty('artifactBuildNumber', nextbuildnum.toString())
 props.store(propsFile.newWriter(), null)
 props.load(propsFile.newDataInputStream())
}
