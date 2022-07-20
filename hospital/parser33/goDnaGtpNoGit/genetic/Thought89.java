package genetic;
import java.util.ArrayList;
class Thought89 extends Thought{
private static ArrayList<Thought89> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 427.6470061880627;
private double fd1 = 616.925100851397;
private Thought fo0 = null;
private Thought fo1 = null;
Thought89 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought89 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought89 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought89 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought89 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought89 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought89 instance = new Thought89 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 969.842787419549;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    ld0 *= -1;
    fd0 *= -1;
    fb1 = fd1 > ld0;
    fd0 *= -1;
    Output.points[7][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2();
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
    boolean lb0 = false;
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb0 = !fb1;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought333.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = lb0 || fb0;
    fb1 = ad1 < ad2;
    if (lb0) {
        if (fb0) {
if(fo1 != null){
              ad3 = fo1.m3();
}
            ad4 *= -1;
            if (fb1) {
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
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ad3 > ad4;
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 || ab3;
        ad4 = fd0 + fd1;
        ab4 = ad1 < ad2;
        fb0 = fb1 || lb0;
        Output.points[7][6] -= ad3;
        ab1 = ab2 || ab3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought383.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld2 = 565.5396906549863;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Thought lo0 = Thought68.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    double ld2 = 458.81412904994886;
    lb1 = fb0 && fb1;
    Output.points[7][7] -= fd0;
    lb1 = fb0 || fb1;
    Output.points[7][8] += fd1;
    Output.points[8][0] += ld2;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 < fd1;
    ld2 *= -1;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;

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
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        double ld0 = 425.20219146587885;
        Output.points[8][1] += ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Output.points[8][2] -= ld0;
        fb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        ad3 = ad4 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Thought lo2 = Thought360.getInstance(ld0, ad1, ad2, ad3);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought269.getInstance();
    ab1 = ab2 || ab3;
    Thought lo1 = Thought65.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, ab1, ab2);
}
        if (ab3) {
            for(int i1=0; i1<10; i1++){
if(ao2 != null){
                  ao2.m3(ao3, ao4, fo0, fo1);
}
                Thought lo3 = Thought243.getInstance(fd1, fd0, fd1, fd0);
                ab4 = fb0 && fb1;
                Output.points[8][3] -= fd1;
                lb2 = ab1 || ab2;
if(ao2 != null){
                  ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = ab3 && ab4;
    ad2 *= -1;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = ad3 > ad4;
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    Output.points[8][4] += ad1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[8][5] -= ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        ab2 = !ab3;
        boolean lb0 = false;
if(ao3 != null){
          ab3 = ao3.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
        double ld1 = 959.1540464276651;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fd0 *= -1;
        fd1 = ld1 + ad1;
        Output.points[8][6] -= ad2;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    Output.points[8][7] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 141.89713469602927;
    Thought lo1 = Thought383.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
    fd0 *= -1;
    double ld2 = 954.1175710578933;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought292.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][8] += fd0;
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 + ld0;

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
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo0 = Thought109.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Thought lo1 = Thought393.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m1();
}
        double ld2 = 112.6345555310843;
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fd1 = ld2 + ad1;
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
    double ld0 = 227.82159565001288;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ad4 > fd0;
    ab1 = fd1 > ld0;
    ab2 = !ab3;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ld0;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ld0 *= -1;
        double ld1 = 333.5879131572132;
    ld1 = ad1 - ad2;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    lb2 = ad3 < ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    Thought lo4 = Thought351.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}

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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    Output.points[0][0] += fd1;
    boolean lb1 = true;
    Output.points[0][1] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought14.getInstance(fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
return lb1;
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
    Thought lo0 = Thought43.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
    double ld1 = 725.0733940381862;
    fb1 = !fb0;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, fb0);
}
    fb1 = ad4 > fd0;
    Thought lo3 = Thought31.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ao2.m3(fd1, ld1, ad1, ad2);
}
    double ld4 = 754.34201315226;
    Thought lo5 = Thought102.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[0][2] -= ld1;
    Output.points[0][3] += ld4;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    double ld1 = 887.7457652829626;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m1(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb2 = false;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb3 = false;
    fd1 *= -1;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    boolean lb4 = false;
    double ld5 = 371.7023044358101;
    double ld6 = 374.9325921951706;
    Output.points[0][4] -= ld5;
    ld6 *= -1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = lb2 && lb3;
    double ld7 = 294.38544372239085;

Thought.STACK_COUNTER++;
return lb4;
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
    Output.points[0][5] += ad1;
    ab2 = ab3 || ab4;
    double ld0 = 128.80969353995613;
    boolean lb1 = true;
    ab4 = ad1 > ad2;
    ad3 *= -1;
    Output.points[0][6] += ad4;
    fb0 = fb1 || lb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    Output.points[0][7] += fd0;
    Output.points[0][8] += fd1;
    ab1 = ld0 > ad1;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ad2 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ab3;
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
    double ld0 = 689.2139809854216;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    boolean lb1 = false;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    double ld3 = 843.7899561127836;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, lb1, lb2, lb4, fb0);
}
    Output.points[1][0] += ld3;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld0, ld3, lb1, lb2, lb4, fb0);
}
    fb1 = fd0 < fd1;
    ld0 = ld3 + fd0;
    lb1 = lb2 || lb4;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought272.getInstance(fo1, fo0, fo1, fo0);
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
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
    fb0 = ad1 < ad2;
    if (fb1) {
        Output.points[1][2] += ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        Thought lo1 = Thought184.getInstance(fo0, fo1, fo0, fo1);
        } else {
        fb1 = fb0 || fb1;
        double ld2 = 122.73775006281566;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld2, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        fb0 = ld2 < ad1;
        ad2 *= -1;
        fb1 = fb0 || fb1;
if(fo1 != null){
          ad3 = fo1.m3();
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fd1 = ld2 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Output.points[1][3] += ad3;
    ab3 = !ab4;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo2 = Thought360.getInstance(fb1, lb0, lb1, ab1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought388.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Output.points[1][4] -= fd1;
    Thought lo3 = Thought236.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = false;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Output.points[1][5] += fd1;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    if (fb1) {
        double ld0 = 823.4470666115939;
        boolean lb1 = true;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        lb1 = fb0 || fb1;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
            fd1 = ld0 + ad1;
            fb1 = lb1 || fb0;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
            boolean lb2 = false;
}}
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
    double ld0 = 747.2863062756533;
    fd0 *= -1;
    boolean lb1 = true;
    Output.points[1][6] += fd1;
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao2.m2(ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      lb1 = ao1.m2(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
    double ld3 = 811.0692672733242;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(ld3, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
    boolean lb4 = true;
    boolean lb5 = false;
    fd0 = fd1 - ld0;
    Output.points[1][7] -= ld3;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    double ld6 = 366.6175969413504;
    ld0 = ld3 + ld6;
    fb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ld0;
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
    ab1 = ad2 > ad3;
    boolean lb0 = true;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
    double ld2 = 163.08967176733816;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo3 = Thought336.getInstance(ao3, ao4, fo0, fo1, ld2, ad1, ad2, ad3);
if(ao1 != null){
      ab4 = ao1.m2();
}
    Thought lo4 = Thought252.getInstance(fb0, fb1, lb0, lb1);
    Thought lo5 = Thought120.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    double ld6 = 150.90400735486546;

Thought.STACK_COUNTER++;
return ld6;
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 749.556933402936;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    fb0 = fb1 || fb0;
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    double ld1 = 989.454361958079;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    Output.points[1][8] += fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    ab1 = fd1 < fd0;

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
    ad2 *= -1;
    boolean lb0 = false;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    if (fb1) {
        lb0 = fd1 < ad1;
        ad2 *= -1;
        Thought lo1 = Thought246.getInstance(ad3, ad4, fd0, fd1);
        Thought lo2 = Thought79.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
        if (fb0) {
            fb1 = lb0 || fb0;
if(fo1 != null){
              fb1 = fo1.m2();
}
            fd0 = fd1 + ad1;
            double ld3 = 697.2073738857383;
            lb0 = fb0 || fb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd1 = ad1 + ad2;
    Output.points[2][0] += ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld1 = 355.61514063522225;
        Output.points[2][1] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 *= -1;
    Thought lo2 = Thought242.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    if (fb0) {
        ld1 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld3 = 796.4604664801475;
        double ld4 = 709.4772984755881;
        ad2 = ad3 - ad4;
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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao2.m1();
}
    fd1 *= -1;
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, lb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Output.points[2][2] += ad4;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ad4 = ao3.m3();
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought316.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld1 = 549.706628076785;
    boolean lb2 = false;
    double ld3 = 390.47294773978075;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld1 = ld3 - ad1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
    Thought lo0 = Thought64.getInstance();
    double ld1 = 175.9162990352057;
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ld1 < fd0;
    ab4 = fd1 < ld1;
    fd0 = fd1 - ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
    ab3 = fd1 > ld1;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(ao1 != null){
      fb0 = ao1.m2();
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    double ld1 = 898.0999956539956;
    Output.points[2][3] += ad1;
    fb1 = lb0 && ab1;
    Thought lo2 = Thought110.getInstance(ao4, fo0, fo1, ao1);
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1(fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
        ld1 *= -1;
    Thought lo3 = Thought218.getInstance();
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
        boolean lb1 = true;
    Output.points[2][4] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb0, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    double ld2 = 265.6153108627341;
    fd0 = fd1 + ld2;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 630.7058063174886;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
        boolean lb2 = false;
        fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;

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
