package genetic;
import java.util.ArrayList;
class Thought286 extends Thought{
private static ArrayList<Thought286> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 352.5781849715809;
private double fd1 = 575.4215496970602;
private Thought fo0 = null;
private Thought fo1 = null;
Thought286 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought286 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought286 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought286 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought286 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought286 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought286 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought286 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought286 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought286 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought286 instance = new Thought286 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought37.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    Output.points[5][4] += fd0;
    Thought lo2 = Thought164.getInstance(fd1, fd0, fd1, fd0);
    double ld3 = 28.186724510221513;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
    Thought lo4 = Thought63.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
    Thought lo5 = Thought230.getInstance();
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fb0 = fd1 < ld3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, fb1, lb1, fb0, fb1);
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
    double ld0 = 428.98952274089686;
    ab1 = ld0 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    ab1 = ab2 && ab3;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    ab3 = ab4 || fb0;
    fb1 = lb1 && ab1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab2 = ab3 || ab4;
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
    Output.points[5][5] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        Thought lo0 = Thought68.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        if (fb1) {
            fd0 = fd1 + ad1;
            fb0 = ad2 > ad3;
            ad4 *= -1;
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
            fb0 = fd0 > fd1;
            Thought lo1 = Thought335.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
            boolean lb2 = true;
            double ld3 = 294.2593051693913;
            ad4 *= -1;
            fd0 = fd1 - ld3;
            fb0 = ad1 > ad2;
            for(int i0=0; i0<10; i0++){
                double ld4 = 990.9264955094503;
                fb1 = lb2 && fb0;
                double ld5 = 485.5994830395393;
                ad1 = ad2 - ad3;
                boolean lb6 = false;
                boolean lb7 = true;
if(fo0 != null){
                  lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4);
}
}}}
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
    ab1 = !ab2;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 524.9134890117314;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    if (fb0) {
if(ao1 != null){
          ao1.m3();
}
        Output.points[5][6] += fd0;
        fb1 = fb0 || fb1;
        boolean lb1 = false;
if(ao2 != null){
          lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
        fb1 = fd1 < ld0;
        for(int i0=0; i0<10; i0++){
            lb1 = fb0 || fb1;
            lb1 = fb0 || fb1;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
            fb0 = fb1 && lb1;
            fd1 = ld0 + fd0;
if(ao2 != null){
              fb0 = ao2.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
            boolean lb2 = false;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1);
}
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
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m1();
}
    lb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        ad2 *= -1;
        ad3 = ad4 + fd0;
if(ao4 != null){
          fd1 = ao4.m3(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ab4 = ao2.m2(fd0, fd1, fd0, fd1);
}
    Output.points[5][7] += fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    ab1 = fd0 > fd1;
    Output.points[5][8] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    Output.points[6][0] -= fd0;
    Thought lo1 = Thought72.getInstance(fo0, fo1, ao1, ao2);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[6][1] -= fd1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
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
    if (ab1) {
        Thought lo0 = Thought273.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        Thought lo1 = Thought226.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ad1;
        Thought lo2 = Thought155.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        double ld3 = 528.9068062725854;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        double ld4 = 794.642832663545;
if(fo0 != null){
          fo0.m2(ld3, ld4, ad1, ad2);
}
        boolean lb5 = true;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 && lb5;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb6 = ab1 && ab2;
        Thought lo7 = Thought147.getInstance(ab3, ab4, fb0, fb1);
if(ao1 != null){
          ld3 = ao1.m3(ao2, ao3, ao4, fo0, ld4, ad1, ad2, ad3, lb5, lb6, ab1, ab2);
}
        ad4 *= -1;
        fd0 = fd1 - ld3;
if(ao1 != null){
          fo1 = ao1.m4(ld4, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ad4 = fd0 + fd1;
        ld3 *= -1;
        ld4 = ad1 + ad2;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb5, lb6, ab1, ab2);
}
        boolean lb8 = false;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    double ld0 = 836.5108358620984;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    fb0 = !fb1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 - fd1;
        ld0 = fd0 - fd1;
        lb1 = fb0 || fb1;
        ld0 = fd0 + fd1;
        lb1 = fb0 || fb1;
        lb1 = ld0 < fd0;
        fb0 = fb1 || lb1;
        Output.points[6][2] += fd1;
        ld0 = fd0 - fd1;
        double ld2 = 129.48004963897372;
        for(int i1=0; i1<10; i1++){
            boolean lb3 = false;
            ld2 = ld0 - fd0;
if(fo1 != null){
              fo1.m1(fd1, ld2, ld0, fd0);
}
}}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought376.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    Thought lo3 = Thought87.getInstance();
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    Output.points[6][3] += fd0;
    fb0 = fd1 < fd0;
    boolean lb4 = false;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return ab4;
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
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
    fb0 = ad1 > ad2;
        ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    fb1 = lb0 || fb0;
    fb1 = ad3 < ad4;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = ad1 - ad2;
        lb0 = !fb0;
        Output.points[6][4] -= ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
        }
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
}
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
    Output.points[6][5] += ad2;
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    ad3 = ad4 - fd0;
    double ld2 = 935.2062362438437;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ad1);
}
    Thought lo3 = Thought238.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      lb1 = fo0.m2();
}
    ab1 = ab2 || ab3;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ab4;
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
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld1 = 945.8992136525128;
    Thought lo2 = Thought10.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
if(ao2 != null){
      ao2.m2(fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought393.getInstance(ao1, ao2, ao3, ao4);
    fb1 = fb0 || fb1;
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    double ld2 = 183.2775711627072;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    double ld3 = 749.7583550678088;
    boolean lb4 = true;
    lb1 = ad3 > ad4;
    lb4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ld3, lb1, lb4, fb0, fb1);
}
    double ld5 = 417.7931554791808;
    lb1 = ld5 < ad1;
    boolean lb6 = true;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        if (lb4) {
            double ld7 = 615.5040597824018;
}}
Thought.STACK_COUNTER++;
return lb6;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = ab1 || ab2;
    Thought lo0 = Thought17.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;

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
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
        ab2 = !ab3;
    Thought lo0 = Thought220.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    Output.points[6][6] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ab2 = ad2 > ad3;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab2;
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
        fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 + fd1;
        Thought lo1 = Thought395.getInstance(fo1, fo0, fo1, fo0);
        Output.points[6][7] -= fd0;
        fb1 = lb0 || fb0;
        fb1 = lb0 || fb0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought53.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought371.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    double ld2 = 676.6998759163521;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    if (fb0) {
        boolean lb3 = false;
        fb0 = fd1 < ld2;
        Thought lo4 = Thought92.getInstance(fd0, fd1, ld2, fd0, fb1, lb3, lb1, ab1);
        ab2 = !ab3;
        Thought lo5 = Thought255.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
        lb1 = fd1 < ld2;
        Thought lo6 = Thought18.getInstance(fo1, fo0, fo1, fo0);
        fd0 = fd1 - ld2;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
        Output.points[6][8] += fd1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 *= -1;
        fb0 = fb1 && lb3;
        double ld7 = 379.65014590990245;
if(fo0 != null){
          lb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld7, ld2, fb0, fb1, lb3, lb1);
}
        ab1 = fd0 > fd1;
        ld7 *= -1;
        ab2 = ab3 || ab4;
        ld2 *= -1;
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
        fb1 = ad3 > ad4;
        fd0 = fd1 - ad1;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        boolean lb3 = true;
if(fo1 != null){
          lb1 = fo1.m2(lb2, lb3, lb0, fb0);
}
        ad1 *= -1;
        fb1 = ad2 > ad3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, lb2, lb3, lb0);
}
        boolean lb4 = false;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, lb4, lb0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd1 = ad1 + ad2;
        fb1 = lb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        lb3 = lb4 && lb0;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought160.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo1 = Thought281.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    Output.points[7][0] += fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ad4 < fd0;
    ab4 = fd1 < ad1;

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
        fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 *= -1;
        boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    Output.points[7][1] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    double ld2 = 140.23278244004706;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    fd1 = ld2 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 || fb1;
        ld2 = fd0 - fd1;
        Output.points[7][2] += ld2;
        fd0 = fd1 - ld2;
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought354.getInstance(fd0, fd1, ad1, ad2);
    fb0 = ad3 < ad4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[7][3] -= ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ad3;
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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = fd1 < fd0;
    Thought lo1 = Thought172.getInstance(ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    lb0 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    Thought lo2 = Thought78.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb3);
}

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
    double ld0 = 672.6744512958667;
if(ao1 != null){
      ld0 = ao1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    lb1 = ad2 < ad3;
    ab1 = !ab2;
        ad4 = fd0 - fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ab3 = ao1.m2();
}
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought223.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    boolean lb3 = true;
    Thought lo4 = Thought354.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
    ad1 = ad2 + ad3;
    Thought lo5 = Thought328.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    ad4 *= -1;
    fd0 = fd1 - ld0;
    ad1 = ad2 + ad3;
    boolean lb6 = false;
    Thought lo7 = Thought20.getInstance(fo0, fo1, ao1, ao2);
    ab4 = ad4 < fd0;
if(ao3 != null){
      ao3.m1(fd1, ld0, ad1, ad2);
}

Thought.STACK_COUNTER++;
return ad3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 914.449548448877;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2();
}
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    fb1 = !lb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
        Output.points[7][4] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    ad3 *= -1;
    Thought lo0 = Thought313.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought342.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    Thought lo3 = Thought117.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld4 = 531.9526668470502;
    fd0 = fd1 - ld4;
    ad1 = ad2 + ad3;
    fb1 = !lb1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld4);
}
        lb5 = !fb0;
    Output.points[7][5] += ad1;
    fb1 = lb1 && lb5;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, ad1, ad2);
}
    Thought lo6 = Thought101.getInstance();
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1, lb1, lb5, fb0, fb1);
}
    lb1 = lb5 && fb0;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    double ld0 = 244.87354349547854;
    fb1 = ab1 || ab2;
    ab3 = ad2 > ad3;
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fb0 = fd0 < fd1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    Output.points[7][6] -= ad1;
    ab3 = ab4 || fb0;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought14.getInstance(fb0, fb1, lb0, fb0);
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    boolean lb2 = false;
    Thought lo3 = Thought56.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
    double ld4 = 605.6593243516579;
    fd0 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
    Output.points[7][7] += fd1;
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    lb0 = lb1 || fb0;
    double ld2 = 979.8836182235083;
    fb1 = lb0 || lb1;
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 856.2348547320651;
    double ld6 = 691.5002184761781;
    lb3 = !lb4;
    double ld7 = 749.048325668489;
    fb0 = fb1 || lb0;
        ld6 *= -1;
    double ld8 = 470.30712237874326;
    boolean lb9 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 864.0924061207119;
    ld0 *= -1;
    fb1 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    double ld1 = 17.043227345374376;

Thought.STACK_COUNTER++;
return ao4;
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
    Output.points[7][8] -= ad2;
    double ld0 = 203.6219217235147;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[8][0] -= ld0;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    Output.points[8][1] += ld0;
    double ld2 = 636.6256294641539;
    ld2 *= -1;
    ab4 = fb0 || fb1;
    double ld3 = 889.1170409171567;
    double ld4 = 552.9240675370648;
    ld3 = ld4 + ad1;
    lb1 = ad2 < ad3;
    Thought lo5 = Thought23.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb6 = false;
    ab4 = fd0 > fd1;
    double ld7 = 652.3379047353968;

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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought36.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
    lb3 = fb0 || fb1;
        lb0 = lb1 && lb3;
    fb0 = fd1 < fd0;

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
    Output.points[8][2] += fd1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought320.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    Thought lo1 = Thought227.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb2 = !fb0;
    fb1 = fd1 > fd0;
    double ld3 = 204.40326289605932;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld3, fd0, fd1, ld3);
}
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fb1, lb2, fb0, fb1);
}
    boolean lb4 = true;
    lb2 = !lb4;

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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 153.74181455596428;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought275.getInstance(fo1, fo0, fo1, fo0);
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = lb3 && fb0;

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
