package genetic;
import java.util.ArrayList;
class Thought112 extends Thought{
private static ArrayList<Thought112> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 668.4225112295601;
private double fd1 = 979.4805081355047;
private Thought fo0 = null;
private Thought fo1 = null;
Thought112 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought112 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought112 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought112 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought112 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought112 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought112 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought112 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought112 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought112 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought112 instance = new Thought112 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][6] += fd0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    Thought lo1 = Thought341.getInstance(fo0, fo1, fo0, fo1);
    lb0 = !fb0;
    if (fb1) {
if(fo0 != null){
          lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
        } else {
        fb0 = fb1 && lb0;
        fb0 = fd0 < fd1;
        fb1 = !lb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
if(fo0 != null){
          fo0.m2();
}
        fd0 *= -1;
        Output.points[7][7] += fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought97.getInstance(lb0, ab1, ab2, ab3);
    if (ab4) {
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        Thought lo2 = Thought70.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        lb0 = ab1 && ab2;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 - fd1;
        ab3 = fd0 < fd1;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        for(int i0=0; i0<10; i0++){
            ab3 = ab4 && fb0;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][8] += ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought15.getInstance();
    fd1 = ad1 + ad2;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought173.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
        fb0 = fd1 < ad1;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1);
    if (fb1) {
        fb0 = fb1 && fb0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought338.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought22.getInstance();
    boolean lb3 = false;
    Output.points[8][0] += ad4;
    lb3 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, lb3, ab1, ab2);
}
    Output.points[8][1] -= ad3;
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = lb0 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 376.1185271671314;
    fb1 = ld0 < fd0;
    Output.points[8][2] += fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ld0 = ao3.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 432.8681765791448;
    lb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = lb1 && fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Output.points[8][3] -= fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = ad4 > fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought244.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    fb1 = lb1 || fb0;
    Output.points[8][4] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 715.997612626599;
    ab1 = !ab2;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    double ld1 = 113.85858224899594;
    Output.points[8][5] += fd0;
    fd1 = ld0 + ld1;
    boolean lb2 = true;
    Thought lo3 = Thought215.getInstance();
    ab2 = ab3 || ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb2, ab1, ab2);
}
    boolean lb4 = false;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ld1 = fd0 + fd1;
if(ao1 != null){
      lb2 = ao1.m2(ld0, ld1, fd0, fd1, lb4, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought120.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought92.getInstance(ad1, ad2, ad3, ad4);
    if (ab1) {
        fd0 = fd1 - ad1;
        for(int i0=0; i0<10; i0++){
            ad2 = ad3 + ad4;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
            ad3 = ad4 - fd0;
            ab2 = !ab3;
            fd1 = ad1 + ad2;
            Output.points[8][6] += ad3;
            ab4 = fb0 || fb1;
            ab1 = ad4 > fd0;
if(fo0 != null){
              fo0.m1();
}
            fd1 *= -1;
            ab2 = ad1 > ad2;
            ab3 = ab4 || fb0;
            boolean lb2 = true;
            boolean lb3 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 942.0942936001591;
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    fb0 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
}
    fb1 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    boolean lb3 = false;
    double ld4 = 278.56860408598214;
    lb0 = !lb2;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld1);
}
    for(int i0=0; i0<10; i0++){
        ld4 = fd0 - fd1;
        boolean lb5 = false;
        ld1 = ld4 - fd0;
        lb3 = fd1 < ld1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld1);
}
if(fo1 != null){
          ld4 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb5, lb0, lb2);
}
        lb3 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        Output.points[8][7] -= fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < fd0;
        Thought lo1 = Thought98.getInstance(fo0, fo1, fo0, fo1);
        fd1 = fd0 - fd1;
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        ab4 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = fd0 - fd1;
        boolean lb2 = false;
        lb2 = ab1 && ab2;
        fd0 = fd1 - fd0;
        Thought lo3 = Thought79.getInstance(ab3, ab4, fb0, fb1);
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 - ad1;
    double ld0 = 731.4568685066746;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    Thought lo3 = Thought110.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = lb2 && fb0;
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    lb1 = !lb2;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[8][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;
    fd1 = ad1 - ad2;
    double ld1 = 829.2966680879863;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    double ld3 = 443.24966346837374;
    Thought lo4 = Thought319.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb0;
    Thought lo5 = Thought390.getInstance(fo1, fo0, fo1, fo0);
    Output.points[0][0] -= ad3;
    double ld6 = 596.3645346860934;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb0 = !fb1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2();
}
    Output.points[0][1] -= fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = !fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][2] += ad2;
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad3 = ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought14.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    Thought lo1 = Thought154.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    Thought lo2 = Thought199.getInstance();
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb3 = false;
    fb0 = fd1 > ad1;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(lb3, fb0, fb1, lb3);
}
    if (fb0) {
        Thought lo4 = Thought347.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, lb3, fb0, fb1);
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        Output.points[0][3] -= ad2;
}
Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[0][4] += fd0;
    ab2 = ab3 && ab4;
    Output.points[0][5] -= fd1;
    double ld0 = 657.6849344959064;
    Thought lo1 = Thought247.getInstance();
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    double ld2 = 774.5907922769373;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld4 = 256.71482532133047;
    fb1 = lb3 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld2, ld4, fd0, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[0][6] -= fd0;
    ab2 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld1 = 154.78092917579391;
    ab3 = ld1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ab4 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
        }
    double ld2 = 273.5761164643403;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    double ld1 = 720.9921148010577;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ld1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought178.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought38.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought323.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m3();
}
    boolean lb4 = false;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    fd1 = fd0 + fd1;
    lb4 = fd0 > fd1;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    Output.points[0][7] += fd1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb4, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb4, lb5, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    boolean lb6 = true;
    Output.points[0][8] -= fd0;
    fd1 *= -1;
    Thought lo7 = Thought26.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb4);

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 75.41543433031242;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = true;
    Output.points[1][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb1 = lb2 || lb3;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, lb2);
}
        ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, lb3, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought344.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, lb3, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 *= -1;
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    ab1 = fd0 < fd1;
    Thought lo0 = Thought341.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    ab3 = fd0 < fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ad1, ad2);
}
    Output.points[1][1] += ad3;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought364.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
    ad1 *= -1;
    Thought lo3 = Thought127.getInstance();

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought360.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought307.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    Thought lo2 = Thought378.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb3 = fb0 || fb1;
    fd0 = fd1 + fd0;
    if (lb3) {
        Thought lo4 = Thought72.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[1][2] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    double ld0 = 84.62187675792667;
    fb0 = !fb1;
    ad4 *= -1;
    boolean lb1 = true;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[1][3] -= fd0;
    double ld0 = 778.257323659284;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Output.points[1][4] += ld0;
if(ao1 != null){
      ab4 = ao1.m2();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought109.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    Output.points[1][5] += ad1;
    ab1 = ad2 > ad3;
        Thought lo1 = Thought48.getInstance();
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    if (ab4) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
        lb3 = !ab1;
        Thought lo4 = Thought373.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, lb2, lb3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ab1 = !ab2;
        ab3 = !ab4;
        double ld5 = 657.3887844104835;
        fd0 = fd1 + ld5;
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
        boolean lb0 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought198.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
            fd0 = fd1 + fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
            double ld2 = 164.3515348821719;
            double ld3 = 839.4032164369252;
            ld3 = fd0 + fd1;
            lb0 = ld2 < ld3;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fb0 = !fb1;
            fd0 *= -1;
            Output.points[1][6] += fd1;
if(fo0 != null){
              lb0 = fo0.m2(ld2, ld3, fd0, fd1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
            boolean lb4 = true;
            ld2 = ld3 - fd0;
            Output.points[1][7] -= fd1;
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
    boolean lb0 = false;
    ab2 = !ab3;
    Output.points[1][8] += fd0;
    Output.points[2][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought175.getInstance(ab4, fb0, fb1, lb0);
    boolean lb2 = true;
    if (lb2) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld3 = 208.8944896201005;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        Output.points[2][1] += ld3;
        fd0 *= -1;
        Output.points[2][2] += fd1;
        Thought lo4 = Thought310.getInstance(ld3, fd0, fd1, ld3);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
        fb0 = fb1 && lb0;
        if (lb2) {
if(fo0 != null){
              fo1 = fo0.m4();
}
            double ld5 = 342.46366039403944;
if(fo1 != null){
              fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld0 = 868.7349163472744;
    boolean lb1 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[2][3] -= fd0;
    boolean lb2 = true;
    Output.points[2][4] += fd1;
    fb0 = ld0 > ad1;
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    Output.points[2][5] += ad2;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = false;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo2 = Thought145.getInstance(lb0, lb1, ab1, ab2);
    Output.points[2][6] += ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought251.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld0 = 619.7553938369173;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
    ad3 *= -1;
    ad4 *= -1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought284.getInstance(fb0, fb1, fb0, fb1);

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
    double ld0 = 177.96051280375409;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
    ld0 *= -1;
    lb1 = lb2 || lb3;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, lb4, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        lb1 = lb2 && lb3;
        lb4 = ab1 || ab2;
        ab3 = ab4 || fb0;
        Thought lo5 = Thought109.getInstance(ao3, ao4, fo0, fo1, fb1, lb1, lb2, lb3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd1 = ao1.m3(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
if(ao2 != null){
          lb4 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        boolean lb6 = true;
        }
    ld0 *= -1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = !ab3;
    Output.points[2][7] -= ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad1 *= -1;
    boolean lb0 = true;
    ab3 = ad2 < ad3;
    Thought lo1 = Thought371.getInstance(ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Output.points[2][8] += ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought277.getInstance(ao4, fo0, fo1, ao1);
        ad1 *= -1;
if(ao2 != null){
          ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && fb0;
    Thought lo0 = Thought346.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    Thought lo2 = Thought356.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[3][0] -= fd1;
    Output.points[3][1] -= fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    Output.points[3][3] += fd0;
    fd1 = fd0 - fd1;
    Output.points[3][4] -= fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    double ld1 = 950.6678212538171;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !lb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fd0 > fd1;
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 919.7656235245943;
    boolean lb1 = true;
    Thought lo2 = Thought385.getInstance(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    Output.points[3][5] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
    ld0 = fd0 + fd1;
    Thought lo3 = Thought273.getInstance(fb1, lb1, fb0, fb1);
    Thought lo4 = Thought26.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    Thought lo5 = Thought76.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    double ld6 = 53.566979604225025;
    fb0 = ld0 < ld6;
    boolean lb7 = false;
    fd0 = fd1 + ld0;
    ld6 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld6, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
